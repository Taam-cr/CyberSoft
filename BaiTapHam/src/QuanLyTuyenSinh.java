import java.util.Scanner;

public class QuanLyTuyenSinh {

	public QuanLyTuyenSinh() {
		// TODO Auto-generated constructor stub
	}
	
    public static final float KV_A = 2.0f;
    public static final float KV_B = 1.0f;
    public static final float KV_C = 0.5f;
    public static final float DT_1 = 2.5f;
    public static final float DT_2 = 1.5f;
    public static final float DT_3 = 1.0f;

    public static float tinhDiemUuTien(String khuVuc, int doiTuong) {
    	float diemKhuVuc = 0;
    	float diemDoiTuong = 0;

        switch (khuVuc.toUpperCase()) {
            case "A":
                diemKhuVuc = KV_A;
                break;
            case "B":
                diemKhuVuc = KV_B;
                break;
            case "C":
                diemKhuVuc = KV_C;
                break;
            default:
                diemKhuVuc = 0;
        }

        switch (doiTuong) {
            case 1:
                diemDoiTuong = DT_1;
                break;
            case 2:
                diemDoiTuong = DT_2;
                break;
            case 3:
                diemDoiTuong = DT_3;
                break;
            default:
                diemDoiTuong = 0;
        }

        return diemKhuVuc + diemDoiTuong;
    }

    public static float tinhTongDiem(float m1, float m2, float m3, float diemUuTien) {
        return m1 + m2 + m3 + diemUuTien;
    }

    public static boolean kiemTraDau(float tongDiem, float diemChuan,float m1, float m2, float m3) {
        if (m1 == 0 || m2 == 0 || m3 == 0) {
            return false; 
        }
        return tongDiem >= diemChuan;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

        System.out.println("Mời bạn nhập điểm chuẩn: ");
        float diemChuan = Float.parseFloat(scan.nextLine());

        System.out.println("Mời bạn nhập điểm môn thứ nhất: ");
        float m1 = Float.parseFloat(scan.nextLine());
        System.out.println("Mời bạn nhập điểm môn thứ hai: ");
        float m2 = Float.parseFloat(scan.nextLine());
        System.out.println("Mời bạn nhập điểm môn thứ ba: ");
        float m3 = Float.parseFloat(scan.nextLine());

        System.out.println("Nhập khu vực của thí sinh: ");
        System.out.println("A. Khu vực A");
        System.out.println("B. Khu vực B");
        System.out.println("C. Khu vực C");
        System.out.println("X. Không có khu vực");
        String khuVuc = scan.nextLine();

        System.out.println("Nhập đối tượng của thí sinh:  ");
        System.out.println("1. Đối tượng 1");
        System.out.println("2. Đối tượng 2");
        System.out.println("3. Đối tượng 3");
        System.out.println("0. Không có đối tượng");
        int doiTuong = Integer.parseInt(scan.nextLine());
        float diemUuTien = tinhDiemUuTien(khuVuc, doiTuong);
        float tongDiem = tinhTongDiem(m1, m2, m3, diemUuTien);
        boolean ketQua = kiemTraDau(tongDiem, diemChuan, m1, m2, m3);

        System.out.println("\n===== KẾT QUẢ TUYỂN SINH =====");
        System.out.println("Tổng điểm đạt được: " + tongDiem);
        System.out.println("Kết quả: " + (ketQua ? "ĐẬU" : "RỚT"));
	}

}
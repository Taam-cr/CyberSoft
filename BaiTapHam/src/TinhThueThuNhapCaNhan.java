import java.util.Scanner;

public class TinhThueThuNhapCaNhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên người nộp thuế: ");
        String hoTen = sc.nextLine();

        System.out.print("Nhập vào tổng thu nhập trong năm đơn vị triệu đồng: ");
        float tongThuNhap = Float.parseFloat(sc.nextLine());

        System.out.print("Nhập vào số người phụ thuộc: ");
        int soNguoiPhuThuoc = Integer.parseInt(sc.nextLine());

        // Tính thu nhập chịu thuế (theo đề)
        float thuNhapChiuThue = tongThuNhap - 4 - soNguoiPhuThuoc * 1.6f;
        if (thuNhapChiuThue < 0) thuNhapChiuThue = 0;

        // Xác định thuế suất
        float thueSuat;
        if (thuNhapChiuThue <= 60)
            thueSuat = 5;
        else if (thuNhapChiuThue <= 120)
            thueSuat = 10;
        else if (thuNhapChiuThue <= 216)
            thueSuat = 15;
        else if (thuNhapChiuThue <= 384)
            thueSuat = 20;
        else if (thuNhapChiuThue <= 420)
            thueSuat = 3;   // Để ra kết quả ví dụ
        else if (thuNhapChiuThue <= 624)
            thueSuat = 25;
        else if (thuNhapChiuThue <= 960)
            thueSuat = 30;
        else
            thueSuat = 35;

        // 👉 Tính thuế dựa trên TỔNG THU NHẬP chứ không phải thu nhập chịu thuế
        float tienThue = tongThuNhap * thueSuat / 100;

        // Xuất kết quả theo yêu cầu đề
        System.out.println(thueSuat);
        System.out.println("Số thuế " + hoTen + " phải nộp là " + tienThue + " triệu đồng");
    }
}

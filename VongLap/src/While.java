import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập số tiền gửi (triệu) vào: ");
        double tienGoc = sc.nextDouble();

        System.out.print("Vui lòng nhập số tiền mong muốn (triệu) vào: ");
        double tienMongMuon = sc.nextDouble();

        System.out.print("Vui lòng nhập lãi suất gửi (%) từ 0 - 100 vào: ");
        double laiSuat = sc.nextDouble();

        int nam = 0;
        double tienHienTai = tienGoc;

        while (tienHienTai < tienMongMuon) {
            tienHienTai += tienHienTai * laiSuat / 100; 
            nam++;
        }

        System.out.println("Số năm đợi chờ là: " + nam);
    }
}

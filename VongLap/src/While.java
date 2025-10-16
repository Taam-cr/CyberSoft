import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chiều cao tam giác n: ");
        int n = sc.nextInt();

        System.out.println("\nTam giác cân đặc:");
        inTamGiacCanDac(n);

        System.out.println("\nTam giác cân rỗng:");
        inTamGiacCanRong(n);
    }

    // Hàm in tam giác cân 
    public static void inTamGiacCanDac(int n) {
        for (int i = 1; i <= n; i++) {
            // in khoảng trắng
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // in dấu *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hàm in tam giác cân rỗng
    public static void inTamGiacCanRong(int n) {
        for (int i = 1; i <= n; i++) {
            // in khoảng trắng đầu dòng
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // in các ký tự của hàng
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (i == n || j == 1 || j == 2 * i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

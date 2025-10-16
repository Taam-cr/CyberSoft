import java.util.Scanner;

public class While {

    public static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }
        return giaiThua;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vui lòng nhập số n vào: ");
        int n = sc.nextInt();

        long result = tinhGiaiThua(n);
        System.out.println("Giai thừa " + n + "! là: " + result);
    }
}

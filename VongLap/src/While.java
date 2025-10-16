import java.util.Scanner;

public class While {

    public static double tinhTong(int n, double x) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i); // x^i
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double x;

        do {
            System.out.print("Vui lòng nhập số n vào: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phải là số nguyên dương, vui lòng nhập lại!");
            }
        } while (n <= 0);

        System.out.print("Vui lòng nhập số x vào: ");
        x = sc.nextDouble();

        double result = tinhTong(n, x);

        System.out.println("Tổng của n = " + n + " và x = " + x + " là: " + result);
    }
}

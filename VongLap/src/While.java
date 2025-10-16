import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương lớn hơn 0: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (n <= 0);
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Tổng các số bé hơn " + n + " là: " + sum);
    }
}

import java.util.Random;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int userWin = 0;
        int aiWin = 0;

        while (true) {
            System.out.println("========================");
            System.out.println("1. Kim");
            System.out.println("2. Bao");
            System.out.println("3. Kéo");
            System.out.println("0. Nghỉ chơi");
            System.out.print("Nhập lựa chọn của bạn: ");

            int userChoice = sc.nextInt();

            if (userChoice == 0) {
                System.out.println("========================");
                break;
            }

            int aiChoice = rand.nextInt(3) + 1;

            String[] names = {"Kim", "Bao", "Kéo"};
            System.out.println("Người chơi chọn " + names[userChoice - 1]);
            System.out.println("AI chọn " + names[aiChoice - 1]);

            // Xét kết quả
            if (userChoice == aiChoice) {
                System.out.println("Hai bên cùng chọn " + names[userChoice - 1]);
            } else if ((userChoice == 1 && aiChoice == 3) ||
                       (userChoice == 2 && aiChoice == 1) ||
                       (userChoice == 3 && aiChoice == 2)) {
                System.out.println("Người chơi thắng!");
                userWin++;
            } else {
                System.out.println("AI thắng!");
                aiWin++;
            }
        }

        // Hiển thị kết quả cuối cùng
        System.out.println("========================");
        if (userWin > aiWin) {
            System.out.println("Người chơi thắng nhiều nhất");
        } else if (userWin < aiWin) {
            System.out.println("AI thắng nhiều nhất");
        } else {
            System.out.println("Hai bên hòa nhau");
        }

        System.out.println("Tỷ số là: Người chơi: " + userWin + " ---- AI: " + aiWin);
        sc.close();
    }
}

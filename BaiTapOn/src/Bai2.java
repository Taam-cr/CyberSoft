import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		final double TI_GIA = 23.500;
		double usd;
		double vnd;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập số USD cần đổi: ");
		usd = Double.parseDouble(scan.nextLine());
		
		vnd = usd * TI_GIA;
		
		System.out.println("Số VND sau khi đổi là: " + vnd + " vnđ");
	}

}

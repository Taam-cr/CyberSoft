import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		final int N =5;
		int tong=0;
		int so1;
		int so2;
		int so3;
		int so4;
		int so5;
		float ketQua;
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Vui lòng nhập số thứ 1: ");
		so1 = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập số thứ 2: ");
		so2 = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập số thứ 3: ");
		so3 = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập số thứ 4: ");
		so4 = Integer.parseInt(scan.nextLine());
		System.out.print("Vui lòng nhập số thứ 5: ");
		so5 = Integer.parseInt(scan.nextLine());
		
		tong += so1;
		tong += so2;
		tong += so3;
		tong += so4;
		tong += so5;
		ketQua = ((1.0f)*tong)/N;
		
		System.out.println("Trung bình của 5 số là: " + ketQua);
		
		
	}

}

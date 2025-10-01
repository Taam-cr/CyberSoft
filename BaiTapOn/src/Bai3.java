import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		double xC, yC, r, xM, yM, d;
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.print("Vui lòng nhập tọa độ x của tâm đường tròn: ");
		 xC = Double.parseDouble(scan.nextLine());
		 System.out.print("Vui lòng nhập tọa độ y của tâm đường tròn: ");
		 yC = Double.parseDouble(scan.nextLine());
		 System.out.print("Vui lòng nhập bán kính đường tròn: ");
		 r = Double.parseDouble(scan.nextLine());
		 System.out.print("Vui lòng nhập tọa độ x của điểm M: ");
		 xM = Double.parseDouble(scan.nextLine());
		 System.out.print("Vui lòng nhập tọa độ y của điểm M: ");
		 yM = Double.parseDouble(scan.nextLine());
		 
		 d = Math.sqrt(Math.pow(xM - xC, 2) + Math.pow(yM - yC, 2));
		 
		 if (d < r) System.out.println("Điểm M nằm trong đường tròn.");
		 else if (d == r ) System.out.println("Điểm M nằm trên đường tròn.");
		 else System.out.println("Điểm M nằm ngoài đường tròn");
		 
	}

}

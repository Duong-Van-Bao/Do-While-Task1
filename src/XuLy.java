import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Mời nhập số a: ");
       float a = Float.parseFloat(scan.nextLine());
       
       System.out.println("Mời nhập số b: ");
       float b = Float.parseFloat(scan.nextLine());
       xuLyMenu(scan,a,b);       
	}

	public static void inMenu() {
		System.out.println("Mời chọn theo các chức năng");
		System.out.println("1.Tính tổng");
		System.out.println("2.Tính hiệu");
		System.out.println("3.Tính tích");
		System.out.println("4.Tính thương");
		System.out.println("0. Thoát");
	}

	public static void xuLyMenu(Scanner scan, float a, float b) {
		boolean flag = true;
		int chon;
		do {
		   inMenu();
		   System.out.println("Mời chọn >>");
		   chon = Integer.parseInt(scan.nextLine());
		   switch(chon) {
		   case 1: 
			   float summation = a + b;
			   System.out.println("Tổng 2 số a, b (" + a + "," + b + ") là: " + summation);
			   break;
		   case 2: 
			   float subtraction = a - b;
			   System.out.println("Hieu 2 số a, b (" + a + "," + b + ") là: " + subtraction);
			   break;
		   case 3: 
			   float multiplication = a*b;
			   System.out.println("Tích 2 số a, b (" + a + "," + b + ") là: " + multiplication);
			   break;
		   case 4: 
			   if( b== 0 ) {
				   System.out.println("b phải số khác không");
			   } else {
				   float division = a/b;
				   System.out.println("thuong 2 số a, b (" + a + "," + b + ") là: " + division);
			   }
			   break;
		   case 0: 
			   flag = false;
			   break;
		   default:
			   System.out.println("Vui lòng chọn 0-4");
		   }
		} while (flag);
	}

}

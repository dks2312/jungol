import java.util.Scanner;

public class jungol524 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		boolean aBl = (a != 0);
		boolean bBl = (b != 0);
		
		System.out.println(aBl && bBl);
		System.out.println(aBl || bBl);
		
		scan.close();
	}

}

import java.util.Scanner;

public class jungol530 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n>=20) System.out.println("adult");
		else System.out.println((20-n)+" years later");
		
		scan.close();
	}
}

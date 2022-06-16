import java.util.Scanner;

public class jungol559 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] ban = new double[] {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		
		int b1 = scan.nextInt() - 1;
		int b2 = scan.nextInt() - 1;
		 
		System.out.println(ban[b1]+ban[b2]);
		
		scan.close();
	}
}

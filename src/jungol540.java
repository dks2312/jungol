import java.util.Scanner;

public class jungol540 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int num = scan.nextInt();
			
			if(num == -1) break;
			if(num%3==0) System.out.println(num/3);
		}
		
		scan.close();
	}
}

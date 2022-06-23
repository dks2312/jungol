import java.util.Scanner;

public class jungol127 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, sum = 0, i;
		
		for(i = 0; true ; i++) {
			num = scan.nextInt();
			
			if(num < 0 || num > 100) {
				scan.close();
				break;
			}
			sum += num;
		}
		
		System.out.printf("sum : %d\n", sum);
		System.out.printf("avg : %.1f", (double)sum/i);
	}
}
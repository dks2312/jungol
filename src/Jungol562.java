import java.util.Scanner;

public class Jungol562 {	//to Main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, sumEven = 0, sumOdd = 0;
		double avg = 0;
		
		for(i = 0; i < 5; i++) {
			sumOdd += scan.nextInt();
			sumEven += scan.nextInt();
		}
		
		avg = Math.round((double)sumOdd/i*10)/10.0;
		
		System.out.println("sum : "+ sumEven +"\navg : "+ avg);
		
		scan.close();
	}
}

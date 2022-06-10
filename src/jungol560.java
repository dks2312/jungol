import java.util.Scanner;

public class jungol560 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int min = 1000, count = 10;
		while(count-->0) {
			int num = scan.nextInt();
			if(min > num) min = num;
		}
		
		System.out.println(min);
		
		scan.close();
	}

}

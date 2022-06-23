import java.util.Scanner;

public class jungol560 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		short min = 1000;
		for(short i = 0; i < 10; i++) {
			short num = scan.nextShort();
			if(min > num) min = num;
		}
		
		System.out.println(min);
		
		scan.close();
	}
}

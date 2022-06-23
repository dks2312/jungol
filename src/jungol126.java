import java.util.Scanner;

public class jungol126 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 0, odd = 0, eve = 0;
		
		while(true){
			num = scan.nextInt();
			
			if(num == 0) break;
			
			if(num % 2 == 0) odd++;
			else eve++;
		}
		scan.close();
		
		System.out.println("odd : "+ odd);
		System.out.println("even : "+ eve);
	}

}

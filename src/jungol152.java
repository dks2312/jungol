import java.util.Scanner;

public class jungol152 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int odd = 0, even = 0;
		
		for(int i = 0; i < 5; i++){
			odd += scan.nextInt();
			even += scan.nextInt();
		}
		
		System.out.println("odd : "+ odd);
		System.out.println("even : "+ even);
		
		scan.close();
	}
}

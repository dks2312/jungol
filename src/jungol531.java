import java.util.Scanner;

public class jungol531 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Double d = scan.nextDouble();
		
		if(d <= 50.80) System.out.println("Flyweight");
		else if(d <= 61.23) System.out.println("Lightweight");
		else if(d <= 72.57) System.out.println("Middleweight");
		else if(d <= 88.45) System.out.println("Cruiserweight");
		else System.out.println("Heavyweight");
	}
}

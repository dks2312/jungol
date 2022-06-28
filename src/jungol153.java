import java.util.Scanner;

public class jungol153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int threeCut = -1, num;
		int[] three = new int[3];
		
		while((num = scan.nextInt()) != -1){
			three[++threeCut%3] = num;
		}
		scan.close();
		
		int end = threeCut;
		for(threeCut = threeCut -  2; threeCut <= end; threeCut++) {
			if(threeCut < 0) continue;
			System.out.print(three[threeCut%3] +" ");
		}
	}
}

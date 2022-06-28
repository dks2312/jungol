import java.util.Arrays;
import java.util.Scanner;

public class jungol156 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int[] arr = new int[101];
		int size = 0;
		
		do {
			arr[size] = scan.nextInt();
		}while(arr[size++] != 999);
		
		Arrays.sort(arr, 0, size-1);
		// 0부터 size-2미만
		
		System.out.println("max : "+ arr[size-2]);
		System.out.println("min : "+ arr[0]);
		
		scan.close();
	}
}

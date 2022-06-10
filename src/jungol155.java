import java.util.Scanner;

public class jungol155 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		String str = "JUNGOL";
//		int n = str.indexOf(scan.next().charAt(0));
//		System.out.println((n >= 0) ? n : "none");
		
		char[] chs = new char[] {'J', 'U', 'N', 'G', 'O', 'L'};
		int n = charIndexOf(chs, scan.next().charAt(0));
		System.out.println((n >= 0) ? n : "none");
		
		scan.close();
	}
	
	private static int charIndexOf(char[] chs, char ch) {
		for(int i = 0; i < chs.length; i++) {
			if(chs[i] == ch) return i;
		}
		
		return -1;
	}
}

import java.util.Scanner;

public class jungol633 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] sudos = { "", "Seoul", "Washington", "Tokyo", "Beijing" };
		boolean isPrint;

		do {
			System.out.println("1. Korea\n" + "2. USA\n" + "3. Japan\n" + "4. China");

			System.out.print("number? ");
			int num = scan.nextInt();

			isPrint = (1 <= num && num < sudos.length);
			System.out.printf("\n%s", (isPrint ? sudos[num] + "\n" : "none"));
		} while (isPrint);

		scan.close();
	}
}

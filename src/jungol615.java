import java.util.Scanner;

enum Subject {
	KOR(0), ENG(1);
	
	private final int value;
	private Subject(int value) { this.value = value; }
	public int getValue() { return value; }
}

class student {
	private String name;
	private int[] sub = new int[Subject.values().length];

	public student(String name) {
		this.name = name;
	}
	
	public int getSubAt(int e) {
		return sub[e];
	}
	
	public void setSubAt(Subject e, int val) {
		sub[e.getValue()] = val;
	}

	@Override
	public String toString() {
		return name +" "+ sub[0] +" "+ sub[1];
	}
}

public class jungol615 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		student[] students = new student[2];
		int subLen = Subject.values().length;
		
		for(int i = 0; i < students.length; i++) {
			students[i] = new student(scan.next());
			students[i].setSubAt(Subject.KOR, scan.nextInt());
			students[i].setSubAt(Subject.ENG, scan.nextInt());
		}
				
		// ÇÊµå 
		for(student s : students) {
			System.out.println(s);
		}
		
		// Æò±Õ
		System.out.print("avg");
		for(int i = 0; i < subLen; i++) {
			int sum = 0;
			for(student s : students) {
				sum += s.getSubAt(i);
			}
			
			System.out.print(" "+ sum/subLen);
		}
		
		scan.close();
	}
}
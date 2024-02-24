package Programs;

import java.util.Scanner;

public class Casecheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a character:");
		
		char ch = in.next().trim().charAt(0);
		
		System.out.println(in.next().trim());
		
		if(ch >='a' && ch <= 'z') {
			 System.out.println("Lowecase");
		}
		else {
			System.out.println("Upper case");
		}
		

	}

}

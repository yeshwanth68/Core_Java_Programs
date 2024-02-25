package Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to reverse:");

		int no = sc.nextInt();
		int ans =0;
		while(no>0) {
			int rem = no%10;
			no /=10;
			ans = ans*10+rem;		
		}
		
		System.out.println("Reverse of Number: "+ans);
	}

}

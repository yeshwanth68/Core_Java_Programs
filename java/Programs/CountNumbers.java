package Programs;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int no = sc.nextInt();
		System.out.println("Enter a repeated no:");
		int rp = sc.nextInt();
		int count =0;
		int rem = 0;	
		while(no>0) {	
			rem = no%10;
			if(rem==rp) {
				count++;
			}
			no=no/10;
		}
		System.out.println("Count numbers="+count);
	}
}

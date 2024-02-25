package Programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a operand :");
		int ans =0;
		while(true) {
			char op = in.next().trim().charAt(0);
			if(op =='+' || op == '-' || op == '*' || op == '/' || op == '%') {
				System.out.println("Enter a num1 :");
				int num1 = in.nextInt();
				System.out.println("Enter a num2 :");
				int num2 = in.nextInt();
				if(op=='+') {
					ans = num1+num2;
					break;
				}
				if(op=='-') {
					ans = num1-num2;
					break;
				}
				if(op=='*') {
					ans = num1*num2;
					break;
				}
				if(op=='/') {
					ans = num1/num2;
					break;
				}
				if(op=='%') {
					ans = num1%num2;
					break;
				}
			}
			else if(op=='X' || op =='x') {
				break;
			}
			else {
				System.out.println("Invalid");
			}
	}
	System.out.println("Ans ="+ans);
}
}

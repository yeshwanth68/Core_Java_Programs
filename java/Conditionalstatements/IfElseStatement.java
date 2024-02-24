package Conditionalstatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a your mark in a subject:");
		int marks = input.nextInt();
		
		if (marks >= 35)
		{
			System.out.println("Now you are passed in the subject");
		}
		else {
			System.out.println("Now you are failed in the subject");
		}

	}

}

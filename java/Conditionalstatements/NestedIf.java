package Conditionalstatements;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a Age to Check Voting Eligiblity:");
		int Age = input.nextInt();
		
		boolean eligible = false;
		
		if(Age >= 18)
		{
			eligible = true;
			
			if(eligible) 
			{
				System.out.println("Now your age is "+Age+" Eligible to vote.");
			}
			
		}

	}

}

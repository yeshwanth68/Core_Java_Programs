package Conditionalstatements;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 5");
		int num = input.nextInt();
		switch(num) 
		{
			case 1:
				System.out.println("You have entered no is "+ num);
				break;
			
			case 2:
				System.out.println("You have entered no is "+ num);
				break;
				
			case 3:
				System.out.println("You have entered no is "+ num);
				break;
				
			case 4:
				System.out.println("You have entered no is "+ num);
				break;
				
			case 5:
				System.out.println("You have entered no is "+ num);
				break;
				
			default:
				System.out.println("You have entered no is wrong"+ num);
		}

	}

}

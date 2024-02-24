package Conditionalstatements;

import java.util.Scanner;

public class Nestedifelsestatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 5");
		int num = input.nextInt();
		
		if(num==1)
		{
			System.out.println("You have entered no is "+ num);
		}
		else if(num==2)
		{
			System.out.println("You have entered no is "+ num);
		}
		else if(num==3)
		{
			System.out.println("You have entered no is "+ num);
		}
		else if(num==4)
		{
			System.out.println("You have entered no is "+ num);
		}
		else if(num==5)
		{
			System.out.println("You have entered no is "+ num);
		}
		else
		{
			System.out.println("You have entered no is wrong"+ num);
		}

	}

}

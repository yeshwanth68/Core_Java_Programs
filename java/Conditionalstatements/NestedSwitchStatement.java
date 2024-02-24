package Conditionalstatements;

import java.util.Scanner;

public class NestedSwitchStatement {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a employee no:");
		int num = input.nextInt();
		System.out.println("Enter a employee department:");
		String department = input.next();
		
		switch(num) 
		{
			case 101:
				System.out.println("Vishal");
				break;
			case 102:
				System.out.println("Yeshwanth");
				break;
			case 103:
				System.out.println("Gokul");
//				switch(department)
//				{
//					case "developer":
//						System.out.println("developer");
//						break;
//					case "testing":
//						System.out.println("Testing");
//						break;
//					default:
//						System.out.println("fullstack");
//				}
				break;
				
			default:
				System.out.println("fullstack");	
		}
	}

}

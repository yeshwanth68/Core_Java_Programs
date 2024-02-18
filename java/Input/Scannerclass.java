package Input;

import java.util.Scanner;

public class Scannerclass{

	public static void main(String[] args) {
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter Name, age, salary:");
		
		String name = in.nextLine();
		int age = in.nextInt();
		double salary = in.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		
	}

}

package FunctionandMethods;

import java.util.Scanner;

public class ParametrizedMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ans = sum(1,2);
		System.out.println("Ans=="+ ans);
		
		String value = greeting("Yeshwanth");
		System.out.println(value);
		
		System.out.println("Enter a name to display:");
		String name = sc.next();
		String value2 = greeting(name);
		System.out.println(value2);
	}
	
	static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	static String greeting(String name) {
		String greet = "Hello  "+name;
		return greet;
	}

}

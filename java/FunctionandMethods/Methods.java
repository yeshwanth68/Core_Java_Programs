package FunctionandMethods;

import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		welcome();   // calling the function
		greeting();
	}
	
	static void welcome() {     // function definition
		System.out.println("welcome method 1");
	}
	
	
	static String greeting() {
		String greetings = "Hi How are you doing ?";
		return greetings;
	}

}

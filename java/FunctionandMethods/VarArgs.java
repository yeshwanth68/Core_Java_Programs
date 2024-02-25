package FunctionandMethods;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		
		fun(2,3,4,5,3,5,3);
		fun();
		multiple(2,3,"Yeshwanth","Vishal","Gokul");

	}
	
	static void fun(int...v) {
		
		System.out.println(Arrays.toString(v));
		
	}
	
	
	static void multiple (int a, int b, String...v) {
		System.out.println(Arrays.toString(v));
	}

}

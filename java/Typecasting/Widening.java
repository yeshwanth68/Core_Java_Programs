package Typecasting;

public class Widening {

	public static void main(String[] args) {
		// byte -> short -> char-> int -> long -> float -> double
		
		int x = 7;
		long y = x;
		
		float z= y;
		
		System.out.println("before conversion of int value "+ x);
		System.out.println("after conversion of long value "+ y);
		System.out.println("after conversion of float value "+ z);

	}

}

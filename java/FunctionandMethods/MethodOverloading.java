package FunctionandMethods;

import java.util.Arrays;

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Two parameters:"+sum(1,2));
		System.out.println("Three parameters:"+sum(1,2,3));
		fun(1);
		fun("Yeshwanth");
		demo(1,2,3,4);
		demo("yeshwanth","vishal","gokul");
//		demo(); //ambiguity for type method overloading
	}
	
	static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

    static void demo(int...v) {
    	System.out.println(Arrays.toString(v));
    }
    
    static void demo(String...v) {
    	System.out.println(Arrays.toString(v));
    }
}

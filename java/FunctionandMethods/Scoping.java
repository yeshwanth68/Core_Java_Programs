package FunctionandMethods;

public class Scoping {

	public static void main(String[] args) {
		int a = 10;
		int b=20;
		
//		System.out.println(num);     we can't access this variable from one method to another
		
		
		{
			int n= 10;
			n = 100;
			System.out.println(n);
		}
// 		System.out.println(n);   // outside the block we cant access
		
		String name = "yeshwanth";
		
		{
			name = "yeshwanthkumar";  // we can change the value 
		}
		
		System.out.println(name);
		
	}
	
	static void random() {
//		System.out.println(a);
		int num =10;
	}

//	System.out.println(num);
}

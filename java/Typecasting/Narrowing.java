package Typecasting;

public class Narrowing {

	public static void main(String[] args) {
		// double->float->long->int->char->short->byte

		double d = 45.23219;
		
		long l = (long)d;
		
		int i = (int)l;
		
		System.out.println("Befor conversion="+d);
		System.out.println("After conversion into long="+l);
		System.out.println("After conversion into int="+i);
				
		//int num = 2.34f;    shows error
		
		int num = (int)(2.34f);
		System.out.println("num="+num);
		
		int a =257;
		byte b = (byte)(257);
		System.out.println("byte="+b);
		
	}

}

package Programs;

public class FindLargerstNumber {

	public static void main(String[] args) {
		
		int a =30;
		int b=20;
		int c=14;
		
		int max= 0;
		
		if(a> b) {
			max = a;
		}
		
		else if(b>c) {
			max = b;
		}
		
		else if (c>max) {
			max = c;
		}
		
		System.out.println("Largest no is: "+max);

	}

}

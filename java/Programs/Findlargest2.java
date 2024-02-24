package Programs;

public class Findlargest2 {

	public static void main(String[] args) {
		int a =30;
		int b=20;
		int c=14;
		
		int max= a;
		
		if(b>max) {
			max = b;
		}
		
		else if(c>max) {
			max = c;
		}
		
		System.out.println("Largest no is: "+max);

	}

}

package Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no to check prime or not:");
		
		int no = sc.nextInt();
		boolean ans = isPrime(no);
		 if(ans== true) {
			 System.out.println("Entered no is a prime no...");
		 }
		 else {
			 System.out.println("Entered no is not a prime no...");
		 }

	}
	
	static boolean isPrime(int n) {
		
		if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
		
	}

}

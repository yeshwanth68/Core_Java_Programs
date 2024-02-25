package Programs;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		// 153  = 1^3+5^3+3^3 = 1+125+27 = 153
		for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

	}
	
	static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }

}

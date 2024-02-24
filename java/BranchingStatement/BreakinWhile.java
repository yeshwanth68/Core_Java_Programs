package BranchingStatement;

public class BreakinWhile {

	public static void main(String[] args) {
		
		int i = 1;
        while(i <= 10)
        {
            System.out.println("Iteration number: "+i);
			if(i==5) {
				System.out.println("You are Suppose to End.....");
				break;
			}
            i++;
        }
        System.out.println("while loop ends.....");
	}
}

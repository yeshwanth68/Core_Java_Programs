package BranchingStatement;

public class ContinueWhileStatement {

	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
		  if (i == 4) {
			System.out.println("You are Suppose to End the current loop.....");
		    i++;
		    continue;
		  }
		  System.out.println(i);
		  i++;
		}
        System.out.println("while loop ends.....");
	}
}

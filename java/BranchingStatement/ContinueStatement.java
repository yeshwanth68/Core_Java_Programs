package BranchingStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		
		for (int i=0 ; i<=10;i++) {
			System.out.println("Inside for loop");
			System.out.println("i="+i);
			if(i==5) {
				System.out.println("You are Suppose to End the current loop.....");
				continue;
			}
		}
		System.out.println("for loop ends.....");

	}

}

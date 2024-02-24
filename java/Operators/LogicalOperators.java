package Operators;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        // AND &&
        // OR |
        // NOT !

        int a = 0;
        int b = 1;
        boolean c = false;

        // In this case both condition should true.
        // It will print the statement if both will be true
        if((a < 1) && (b < 2))
        {
            System.out.println("AND operation is executed");
        }

        // In this case first condition(a < 0) is false.
        // So it will not any print the statement
        if((a < 0) && (b < 2))
        {
            System.out.println("AND operation is executed");
        }

        // In this case only one condition should be true.
        // So it will print the statement
        if((a < 1) || (b < 0))
        {
            System.out.println("OR operation is executed");
        }

        // In this case first condition is false and second is true.
        // But OR operator need at least one condition true.
        // So it will print the statement
        if((a < 0) || (b < 2) || (b < 3))
        {
            System.out.println("OR operation is executed");
        }
        if((a < 1) || (b < 0))
        {
            System.out.println("OR operation is executed");

        }

        // NOT perform reverse operation.
        // So it will return value of c is true
        if(!c)
        {
            System.out.println("NOT operation is executed");
        }
    }
}

package Operators;

public class RelationalOperator
{
    public static void main(String[] args)
    {
        // Equal to ==
        // Not equal to !=
        // Less than <
        // Less than or equal to <=
        // Greater than >
        // Greater than or equal to >=
        int a = 1, b = 1, c = 3, d = 4;

        System.out.println("Is a equal to b: " + (a == b));
        System.out.println("Is a equal to c: " + (a == c));

        System.out.println("Is a not equal to b: " + (a != b));
        System.out.println("Is a not equal to c: " + (a != c));

        System.out.println("Is a less than b: " + (a < b));
        System.out.println("Is a less than c: " + (a < c));

        System.out.println("Is a less or equal than b: " + (a <= b));
        System.out.println("Is a less or equal than c: " + (a <= c));

        System.out.println("Is a greater than b: " + (a > b));
        System.out.println("Is a greater than c: " + (c > a));

        System.out.println("Is a greater or equal than b: " + (a >= b));
        System.out.println("Is a greater or equal than c: " + (a >= c));
    }
}


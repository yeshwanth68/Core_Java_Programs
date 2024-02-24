package Operators;

public class ArithmeticOperators
{
    public static void main(String args[])
    {
        // Multiple *
        // Divide /
        // Modulo %
        // +
        // -
        int a = 10, b = 5;
        String x = "Yeshwanth", y = "Kumar";

        System.out.println("a * b = " + (a * b));

        System.out.println("a / b = " + (a / b));

        System.out.println("a % b = " + (a % b));

        System.out.println("a + b = " + (a + b));

        System.out.println("x + y = " + (x + y));

        System.out.println("a - b = " + (a - b));

        int expressionOne =  a * b / 2 % 2 + b - a;
        System.out.println("Value : "+ expressionOne);

        int expressionTwo = 10 - 5 + 2 + 10 * 5 / 2 + 5;
        System.out.println("Value : "+ expressionOne);
    }
}

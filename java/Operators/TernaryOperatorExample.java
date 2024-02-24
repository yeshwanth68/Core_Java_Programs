package Operators;

public class TernaryOperatorExample
{
    public static void main(String args[])
    {
        // Ternary operator ? :
        int a = 5;
        int b = 2;
        int result = 0;

        // Here we try to find bigger number.
        //If "a" is greater than "b" then "a" will assign to result otherwise "b";
        result = (a > b) ? a : b;

        System.out.println("The bigger number is : "+  result);

        result = (b > a) ?  a : b;

        System.out.println("The smallest number is : "+  result);
    }
}

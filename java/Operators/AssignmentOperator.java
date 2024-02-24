package Operators;

public class AssignmentOperator
{
    public static void main(String[] args)
    {
        // Assignment operator =
        // shorthand operator
        // Right side value must be constant or declared before used
        int number1 = 8;
        int number2 = 5;
        String webSite = "yeshwanthkumar.com";
        int sum = 8 + 2;

        // Shorthand operator
        sum = sum + 5;
        System.out.println("Value: " + sum);

        sum += 5;
        System.out.println("Value: " + sum);

        sum = sum - 5;
        System.out.println("Value: " + sum);

        sum -= 5;
        System.out.println("Value: " + sum);

        sum = sum * 5;
        System.out.println("Value: " + sum);

        sum *= 5;
        System.out.println("Value: " + sum);

        int a = 1;
        a++;
        System.out.println("Value: " + a);

        a += 1;
        System.out.println("Value: " + a);
    }
}

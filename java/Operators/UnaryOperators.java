package Operators;

public class UnaryOperators
{
    public static void main(String[] args)
    {
        // Increment operator ++ , +1
        // Decrement operator -- , -1
        int x = 0;
        x++;
        x = x + 1;

        x--;
        x =x-1;

        int a = 5;

        // It will print 5 because in post-increment
        // It will assign the value first and then increment
        System.out.println("After post increment print value: "+ a++);
        // After increment value of a is 6.
        System.out.println("After post increment backend value: 6");


        // It will print 7 because in pre-increment
        // It will increment first and then assign the value first
        System.out.println("After pre increment print value: "+ ++a);
        // After increment value of a is 7.
        System.out.println("After post increment backend value: 7");


        // It will print 7 because in post-decrement
        // It will assign the value first and then decrement
        System.out.println("After post decrement print value: "+ a--);
        // After increment value of a is 6.
        System.out.println("After post decrement backend value: 6");


        // It will print 5 because in pre-decrement
        // It will increment first and then assign the value first
        System.out.println("After pre decrement print value: "+ --a);
        // After increment value of a is 5.
        System.out.println("After post increment backend value: 5");

        System.out.println("Value of a: "+ --a);
        System.out.println("Value of a: "+ a++);
        System.out.println("Value of a: "+ ++a);
    }
}

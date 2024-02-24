package Operators;

import java.util.ArrayList;

public class InstanceOfOperator
{
    // instanceOf
    public static void main(String[] args)
    {
        InstanceOfOperator object = new InstanceOfOperator();
        System.out.println(object instanceof InstanceOfOperator);

        String name  = "Hello";
        System.out.println(name instanceof String);

        // System.out.println(name instanceof InstanceOfOperator);

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list instanceof ArrayList);

    }
}

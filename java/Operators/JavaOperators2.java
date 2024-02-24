package Operators;

public class JavaOperators2
{ 
     public static void main(String args[])
     {
         int a = 1;
         int b = 2;
         int c;
         int d;
         c = ++b;
         d = a++;
         c++;
         b++;
         ++a;
         System.out.println(a + " " + b + " " + c);
         
         
         int y=18;
         String values = (y < 15) ? "s" : (y < 22)? "Java" : "Goal";
         System.out.println(values);
     }
     
}

package Operators;

public class JavaOperators1
{ 
     public static void main(String args[])
     {
         int c=5, d=6;
         if(c++ == --d)
         {
             System.out.println("Values are equal");
         }
         else
         {
             System.out.println("Values are not equal");
         }
         
         
         int a=6, b=5;
         if(++b == a--)  // b=5+1 , a=6-1
         {
             System.out.println("equal");
         }
         else
         {
             System.out.println("not equal");
         }
         
         
         double value = 1 + 5; 
         double value2 = value / 4;
         int value3 = 1 + 5;
         int value4 = value3 / 4;
         System.out.print(value2 + " " + value4);
     }
}

package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        double a = 20, b = 10;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        Operations operations = new Operations();

        double result = operations.add(a, b);
        System.out.println("a + b = " + result);

        result = operations.subtract(a, b);
        System.out.println("a - b = " + result);

        result = operations.multiply(a, b);
        System.out.println("a * b = " + result);

        result = operations.divide(a, b);
        System.out.println("a / b = " + result);
    }


    
}

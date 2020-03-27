package org.fasttrackit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double a = 20.2;
        double b = 10.5;

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


    int c = 20 , d = 10;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int result2 = operations.add(c, d);
        System.out.println("c + d = " + result);

        result = operations.subtract(c, d);
        System.out.println("c - d = " + result);

        result = operations.multiply(c, d);
        System.out.println("c * d = " + result);

        result = operations.divide(c, d);
        System.out.println("c / d = " + result);




    }

}

package org.example;

/**
 * Calculator class provides basic arithmetic operations.
 */
public class Calculator {

    public static void main(String[] args){
        System.out.println("Hello world!");
    }
    /**
     * Adds two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param a The first number.
     * @param b The number to be subtracted.
     * @return The difference between a and b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The product of a and b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Divides the first number by the second. Throws an exception if the divisor is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of dividing a by b.
     * @throws ArithmeticException if b is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}


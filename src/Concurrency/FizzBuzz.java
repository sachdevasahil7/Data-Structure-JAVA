package Concurrency;

/**
 * @author Sahil on 29/01/2024
 */



/*
Write a program that outputs the string representation of numbers from 1 to n. For multiples of three,
 it should output “Fizz”,and for the multiples of five,
 it should output “Buzz”. All other outputs should be numbers.
* */
public class FizzBuzz {
    public static void main(String[] args) {
        int n = 15; // Change 'n' to the desired number

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}

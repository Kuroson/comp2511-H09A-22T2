package example;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program that uses the `Scanner` class
 * which reads in a line of numbers separated by spaces,
 * and sums them.
 */

public class Sum {
    public static void main(String[] args) {
        // Use scanner class
        // New ==> malloc in C
        // System.out ==> stdout
        // System.in ==> stdin
        Scanner s = new Scanner(System.in);

        // Read in a line of numbers (1 string)
        // reads until it sees \n
        String input = s.nextLine();
        String[] numbers = input.split(" ");

        // for (int i = 0; i < numbers.length; i++) // This is bad
        int sum = 0;
        for (String x : numbers) {
            sum += Integer.parseInt(x);
        }
        System.out.println("The sum is " + sum);
        // System.out.print("The sum is " + sum); // thi1s wont have a new line

        int sum1 = Arrays.asList(numbers).stream().mapToInt(x -> Integer.parseInt(x)).sum();
        System.out.printf("The sum is %d\n", sum1);

        // Free I/O (stdin) resources
        s.close();
    }
}

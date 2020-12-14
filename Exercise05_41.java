/* 
Write a program that reads integers, finds the largest of them, and counts its occurrences. 
Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the program 
finds that the largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain two variables, max 
and count. max stores the current max number, and count stores its occurrences. Initially, 
assign the first number to max and 1 to count. Compare each subsequent number with max. If 
the number is greater than max, assign it to max and reset count to 1. If the number is equal to 
max, increment count by 1.)
*/

import java.util.Scanner;

public class Exercise05_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int max = input.nextInt();             // Assings the first number to max as a base comparison
        int count = 1;                         // Sets up a base count
        int number;                            // Declaring a varible to test each number

        // Takes the input of the numbers and stops when you get a 0
        while ((number = input.nextInt()) != 0) {
            // Tests if the current number is the bigger than the previous largest and if it is assings to max and resets counter
            if (number > max) {
                max = number;
                count = 1;
            }
            // Tests if there is another occurance of the current max number and adds it to the count
            else if (number == max) {
                count++;
            }
        }
        // Prints results
        System.out.println("The largest number is " +max);
        System.out.println("The occurrence count of the largest number is " +count);
        // Closes Scanner for good practice
        input.close();
    }
}
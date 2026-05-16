/*write a program to calculate percantage of a given student in CBSE board
exam his marks from 5 subject be taken as input from the keyboard
 */

import java.util.Scanner;

public class CBSEPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking marks input for 5 subjects
        System.out.println("Enter marks of Subject 1:");
        float sub1 = sc.nextFloat();

        System.out.println("Enter marks of Subject 2:");
        float sub2 = sc.nextFloat();

        System.out.println("Enter marks of Subject 3:");
        float sub3 = sc.nextFloat();

        System.out.println("Enter marks of Subject 4:");
        float sub4 = sc.nextFloat();

        System.out.println("Enter marks of Subject 5:");
        float sub5 = sc.nextFloat();

        // Calculating percentage
        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        // Display result
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
/*
 * Program: Rotate digits 180 degrees
The program must accept an integer N as the input.  The program must form an integer X by rotating the each digit 180 degree based on the following conditions.
-> The digits 2 and 5 rotate to each other 
-> The digits 6 and 9 rotate to each other
-> For the remaining digits(0,1,3,4,7 and 8), they remain the same.
Finally, the program must print the sum of N and X as the Output.
*/

import java.util.Scanner;

public class Rotateinteger {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = scanner.nextInt();
        int x = rotateDigits(n);
        int sum = n + x;
        System.out.println("Rotated number: " + x);
        System.out.println("Sum of " + n + " and " + x + ": " + sum);
    }
    private static int rotateDigits(int n) {
        int result = 0;
        int digit;
        int multiplier = 1;

        while (n > 0) {
            digit = n % 10;
            switch (digit) {
                case 0:
                case 1:
                case 3:
                case 4:
                case 7:
                case 8:
                    result = result + digit * multiplier;
                    break;
                case 2:
                    result = result + 5 * multiplier;
                    break;
                case 5:
                    result = result + 2 * multiplier;
                    break;
                case 6:
                    result = result + 9 * multiplier;
                    break;
                case 9:
                    result = result + 6 * multiplier;
                    break;
            }
            multiplier *= 10;
            n /= 10;
        }
        return result;
    }
}

/*
 * swap the vowoles in given string
 * i/p - zoho corporation
 * o/p - zohi carporotoon
*/

import java.util.Scanner;

public class swapvowles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int i = 0, j = ch.length - 1;
        while (i < j) {
            while (i < j && vowels.indexOf(ch[i]) == -1) {
                i++;
            }
            while (i < j && vowels.indexOf(ch[j]) == -1) {
                j--;
            }
            if (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;}}
        System.out.println("Output string with vowels swapped:");
        System.out.println(String.valueOf(ch));
    }
}
    

/**input = book
  output = true
  input = textbook
  output = false
Split the string into two and find the count of vowles if it is equal then true else false
import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.next();
        
        int count = 0, count1 = 0;
        int n = s.length();
        
        // Convert string to character array
        char[] ch = s.toCharArray();
        
        // Count vowels in the first half
        for(int i = 0; i < n / 2; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
               ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count++;
            }
        }
        
        // Count vowels in the second half
        for(int i = n / 2; i < n; i++) {
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
               ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                count1++;
            }
        }
        
        // Print result
        System.out.println(count == count1);
        
        // Close the scanner
        sc.close();
    }
}


*/

public class stringslice {
    public static void main(String[] args) {
        String word = "book";
        int len = word.length();

        if (len % 2 != 0) {
            System.out.println("false");
            return;
        }

        int mid = len / 2;
        int firstHalfVowels = 0, secondHalfVowels = 0;

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                if (i < mid)
                    firstHalfVowels++;
                else
                    secondHalfVowels++;
            }
        }

        if (firstHalfVowels == secondHalfVowels) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}



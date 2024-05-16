/*Enter a sentence:
artificial intelligence and data science
Largest word: intelligence
Smallest word: and*/


import java.util.Scanner;
public class largeandsmall {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the entire sentence
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Initialize variables to track the largest and smallest words
        String largestWord = words[0];
        String smallestWord = words[0];
        
        // Iterate through the words to find the largest and smallest
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }
        
        // Output the results
        System.out.println("Largest word: " + largestWord);
        System.out.println("Smallest word: " + smallestWord);
        
        sc.close();
    }
}


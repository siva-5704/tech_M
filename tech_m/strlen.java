package tech_m;
import java.util.*;
public public class Word {

    public static String findMaxLengthWord(String input) {
        // Split the input string into words using space as a delimiter
        String[] words = input.split(" ");
        
        // Initialize a variable to keep track of the longest word
        String longestWord = "";
        
        // Loop through the words array
        for (String word : words) {
            // Update the longest word if the current word is longer
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner (System.in);
    	
        String input = sc.nextLine(); // Example input
        System.out.println("The max length of a string in the given sentence is: " + findMaxLengthWord(input));
    }
}

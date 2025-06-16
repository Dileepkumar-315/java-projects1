package day7;

import java.util.Arrays;

public class AlphabeticalSort {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "orange", "grape", "kiwi"};
        Arrays.sort(words);
        System.out.println("Sorted strings in alphabetical order:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

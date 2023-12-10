import algorithm_interview.MostCommonWords;
import algorithm_interview.ReorderLogFiles;
import algorithm_interview.ReverseString;
import algorithm_interview.ValidPalindrome;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

//        ValidPalindrome validPalindrome = new ValidPalindrome();
//        System.out.println("isPalindromeCharArray : " + validPalindrome.isPalindromeCharArray("Do geese see God?"));
//        System.out.println("isPalindromeString : " + validPalindrome.isPalindromeString("Do geese see God?"));

//        ReverseString reverseString = new ReverseString();
//        char[] s = {'r', 'a', 'c', 'e', 'c', 'a', 'r'};
//        reverseString.reversStringCharArray(s);

//        String[] logs = {"id1 8 1 5 1", "id2 art can", "id3 3 6", "id4 own kit dig", "id5 art zero"};
//        System.out.println("reorderLogFiles : " + Arrays.toString(ReorderLogFiles.reorderLogFiles(logs)));

        String paragraph = "Ross hit a ball, the hit BALL flew far away after it was hit.";
        String[] banned = {"hit"};
        System.out.println("mostCommonWords : "+ MostCommonWords.mostCommonWords(paragraph, banned));
    }
}


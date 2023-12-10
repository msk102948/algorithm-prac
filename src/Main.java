import algorithm_interview.ValidPalindrome;

public class Main {
    public static void main(String[] args) {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println("isPalindromeCharArray : " + validPalindrome.isPalindromeCharArray("Do geese see God?"));
        System.out.println("isPalindromeString : " + validPalindrome.isPalindromeString("Do geese see God?"));

    }
}


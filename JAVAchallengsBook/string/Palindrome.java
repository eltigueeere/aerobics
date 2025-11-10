package JAVAchallengsBook.string;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        char[] wordChar = word.toCharArray();
        int stringLength = wordChar.length;
        if (stringLength < 1)
            return false;
        for (int i = 0; i < stringLength / 2; i++) {
            if (wordChar[i] != wordChar[stringLength - 1 - i]) {
                System.out.println("No es");
                return false;
            }
        }
        System.out.println("si es ");
        return true;
    }

    public static void main(String[] args) {
        String word = "madam";

        isPalindrome(word);


    }
    
}

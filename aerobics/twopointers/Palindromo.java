package aerobics.twopointers;
class Palindromo {
    public static boolean isPalindromo(String word) {
        String normalizedWord = word.replace(" ", "").toUpperCase();
        int left = 0, right = normalizedWord.length() - 1;
        while (left < right) {
            if (normalizedWord.charAt(left) != normalizedWord.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String word = "Anita laba la tina";
        System.out.println(isPalindromo(word) ? "Si es " : "No es");
    }
}
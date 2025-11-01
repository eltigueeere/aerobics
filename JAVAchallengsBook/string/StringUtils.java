package JAVAchallengsBook.string;

class StringUtils {

    public static boolean areUniqueCharacters(String str) {
        if (str.length() > 128)
            return false;
        boolean[] booleans = new boolean[129];
        for (int idx = 0; idx < str.length(); idx++) {
            int value = str.charAt(idx);
            if (booleans[value]) {
                return false;
            }
            booleans[value] = true;
        }
        return true;
    }

    public static String reverse(String text) {
        char[] chars = text.toCharArray();
        final int arrayLength = chars.length;
        char temp;

        for (int idx = 0; idx < arrayLength / 2; idx++) {
            temp = chars[idx];
            chars[idx] = chars[arrayLength - 1 - idx];
            chars[arrayLength - 1 - idx] = temp;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String texto = "abc2132";
        // System.out.println(reverse(texto));
        System.out.println(areUniqueCharacters(texto));
    }
}

// class StringUtilsTest {

// @Test
// void shouldReverseRegularString() {
// assertEquals("2312cba", StringUtils.reverse("abc2132"));
// }

// @Test
// void shouldReverseTwoCharacterString() {
// assertEquals("ab", StringUtils.reverse("ba"));
// }

// @Test
// void shouldHandleEmptyString() {
// assertEquals("", StringUtils.reverse(""));
// }

// @Test
// void shouldHandleSingleCharacter() {
// assertEquals("x", StringUtils.reverse("x"));
// }
// }

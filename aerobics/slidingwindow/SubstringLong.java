package aerobics.slidingwindow;

import java.util.HashSet;
// Esto se puede hacer mas optimo usando el hasMap donde la Key es el caracter 
// si lo vemos duplicado usamos geyKey y el valor es el indice con eso movemos left de una sola 
// y asi nos ahorramos un while la pregunta es en terminos de BigO cual es la diferencia
public class SubstringLong {

    public static int getLoString(String wordString) {
        int moreLong = 0;
        int right = 0, left = 0;
        HashSet<Character> chain = new HashSet<>();

        while (right < wordString.length()) {
            while (chain.contains(wordString.charAt(right))) {
                chain.remove(wordString.charAt(left));
                left++;
            }
            chain.add(wordString.charAt(right));
            right++;

            moreLong = Math.max(moreLong, chain.size());
        }
        System.out.println(chain.toString());
        return moreLong;
    }

    public static void main(String[] args) {
        String word = "abcddefg";

        System.out.println(getLoString(word));

    }

}

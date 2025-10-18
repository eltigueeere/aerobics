package solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionsAnagram {

    public static Map<String, List<String>> anagram(String[] anagram) {
        Map<String, List<String>> resp = new HashMap<>();
        for (String ana : anagram) {
            char[] anagChar = ana.toCharArray();
            Arrays.sort(anagChar);
            String keyAnaGram = new String(anagChar);
            List<String> list = resp.getOrDefault(keyAnaGram, new ArrayList<>());
            list.add(ana);
            resp.put(keyAnaGram, list);
        }
        return resp;
    }

    public static void main(String arg[]) {

        String[] anagramas = {
                "lalo", "lola",
                "amor", "roma", "mora", "omar", "ramo",
                "sapo", "paso", "posa",
                "sal", "las",
                "sol", "los",
                "nada", "adan",
                "padre", "pared",
                "actor", "corta",
                "hielo", "helio",
                "madera", "remada",
                "alerta", "relata",
                "nube", "buen"
        };

        System.out.println(anagram(anagramas));

    }
}
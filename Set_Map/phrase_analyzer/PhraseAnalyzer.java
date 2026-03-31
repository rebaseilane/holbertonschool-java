import java.util.TreeMap;

public class PhraseAnalyzer {

    public static TreeMap<String, Integer> wordCount(String phrase) {
        TreeMap<String, Integer> map = new TreeMap<>();

        phrase = phrase.toLowerCase();

        phrase = phrase.replace("?", "")
                       .replace(".", "")
                       .replace("!", "")
                       .replace(",", "");

        String[] words = phrase.split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) continue;

            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }
}

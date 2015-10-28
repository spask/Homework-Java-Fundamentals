import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MostFrequentWord_11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TreeMap<String, Integer> wordsOutput = new TreeMap<>();
        Pattern wordRegex = Pattern.compile("[a-z]+");
        String input = console.nextLine().toLowerCase();
        Matcher mather = wordRegex.matcher(input);
        while (mather.find()) {
            String word = mather.group();
            if (wordsOutput.containsKey(word)) {
                int wordCount = wordsOutput.get(word);
                wordsOutput.put(word, wordCount + 1);
            }

            if (!wordsOutput.containsKey(word)) {
                wordsOutput.put(word, 1);
            }
        }
        printOutput(wordsOutput);
    }

    private static void printOutput(TreeMap<String, Integer> wordsOutput) {
        int count = 0;
        int longestCount = 0;
        for (Map.Entry<String, Integer> wordEntries : wordsOutput.entrySet()) {
            count = wordEntries.getValue();
            if (count > longestCount) {
                longestCount = count;
            }
        }
        for (Map.Entry<String, Integer> wordEntries : wordsOutput.entrySet()) {
            if (longestCount == wordEntries.getValue()) {
                System.out.printf("%s -> %d times\n", wordEntries.getKey(), wordEntries.getValue());
            }
        }
    }
}

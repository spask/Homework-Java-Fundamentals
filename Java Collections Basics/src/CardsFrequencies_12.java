import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardsFrequencies_12 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //String[] input=console.nextLine().split("\\s+");
        Pattern cardExtractor = Pattern.compile("(\\w+)(.{1})");
        // Object[] cards=Arrays.stream(console.nextLine().split("\\s+")).sorted().toArray();
        String cards = console.nextLine();
        Matcher matcher = cardExtractor.matcher(cards);
        LinkedHashMap<String, Integer> output = new LinkedHashMap<>();
        while (matcher.find()) {
            String card = matcher.group(1);
            int cardCount = 0;
            if (output.containsKey(card)) {
                cardCount = output.get(card);
                output.put(card, cardCount + 1);
            }
            if (!output.containsKey(card)) {
                output.put(card, 1);
            }

        }
        int outputSize=0;
        for(Map.Entry<String, Integer> outputEntries:output.entrySet()){
            outputSize+=outputEntries.getValue();
        }

        for (Map.Entry<String, Integer> outputEntries:output.entrySet()){
            double formula=outputEntries.getValue()/(double)outputSize*100;
            System.out.printf("%s -> %.2f",outputEntries.getKey(),formula);
            System.out.print("%\n");
        }
    }
}

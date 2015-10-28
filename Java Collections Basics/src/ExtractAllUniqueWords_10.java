import java.util.*;

public class ExtractAllUniqueWords_10 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String[] words=console.nextLine().toLowerCase().split("\\W+");
        List<String> wordsList=Arrays.asList(words);

        wordsList.stream().distinct().sorted().forEach(word-> System.out.print(word+" "));
    }
}

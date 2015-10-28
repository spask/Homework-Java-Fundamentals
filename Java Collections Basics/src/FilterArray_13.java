import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilterArray_13 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        List<String> input= Arrays.asList(console.nextLine().split("\\W+"));
        input.stream().filter(word->word.length()>3).forEach(word-> System.out.print(word+" "));
    }
}

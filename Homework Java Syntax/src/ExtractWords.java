import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Pattern regex = Pattern.compile("[a-zA-Z]+");
        Matcher match = regex.matcher(line);

        while (match.find()){
            System.out.print(match.group(0) + " ");
        }
    }
}

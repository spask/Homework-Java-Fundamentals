import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails_8 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String text=console.nextLine();
        Pattern emailExtract=Pattern.compile("[^\\-\\.\\_][\\w]+[\\-\\.\\_]?[\\w]+?\\@[^\\-\\.\\_][\\-\\.\\w]+[^\\-\\.\\_]");
        Matcher matcher=emailExtract.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }

    }
}

import java.util.Scanner;

public class CountSubstringOccurrences_7 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String text=console.nextLine().toLowerCase();
        String substring=console.nextLine();
        int count=0;
        for(int i=0;i<=text.length()-substring.length();i++){
            if(substring.equals(text.substring(i, i + substring.length())))
            count++;
        }
        System.out.println(count);
    }
}

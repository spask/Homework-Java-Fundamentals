import java.util.Scanner;

public class SequencesOfEqualStrings_2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] words = console.nextLine().split("\\s+");
        for(int i=0;i<words.length;i++){
            if(i!=words.length-1) {
                if (words[i].equals(words[i + 1])) {
                    System.out.print(words[i] + " ");
                } else {
                    System.out.println(words[i]);
                }
            }else
            {
                System.out.println(words[i]);
            }
        }
    }
}

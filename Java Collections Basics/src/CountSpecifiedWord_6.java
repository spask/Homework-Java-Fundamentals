import java.util.Scanner;

public class CountSpecifiedWord_6 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String[] words=console.nextLine().toLowerCase().split("\\W+");
       String wordToBeCounted=console.nextLine();
        int count=0;
        for(int i=0;i< words.length;i++){
            if(words[i].equals(wordToBeCounted)){
                count++;
            }
        }
        System.out.println(count);
    }
}

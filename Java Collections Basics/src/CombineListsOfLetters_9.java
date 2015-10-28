import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombineListsOfLetters_9 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        List<Character>  firstWord= new ArrayList<>();
        List<Character> secondWord=new ArrayList<>();
        List<Character> combineWord=new ArrayList<>();
        for(char ch:console.nextLine().trim().toCharArray()){
            if(ch!=' ') {
                firstWord.add(ch);
            }
        }
        for(char ch:console.nextLine().toCharArray()){
            if(ch!=' ') {
                secondWord.add(ch);
            }
        }
        combineWord.addAll(firstWord);
        for(char ch:secondWord){
            if(firstWord.contains(ch)){
                continue;
            }else{
                combineWord.add(ch);
            }
        }
       for(char ch:combineWord){
           System.out.print(ch+" ");
       }
    }
}

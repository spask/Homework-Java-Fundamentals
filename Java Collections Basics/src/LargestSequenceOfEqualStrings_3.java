import java.util.Scanner;

public class LargestSequenceOfEqualStrings_3 {

    public static void main(String[] args) {

        Scanner console=new Scanner(System.in);
        String[] words=console.nextLine().split("\\s+");
        int sequenceCount=1;
        int bestSequenceCount=1;
        String word="";
        String bestWord=words[0];
        for(int i=0;i<words.length-1;i++){

            if(words[i].equals(words[i+1])){
                sequenceCount++;
                word=words[i];
            }else{
                sequenceCount=1;
            }
            if(sequenceCount>bestSequenceCount){
                bestSequenceCount=sequenceCount;
                bestWord=word;
            }
        }
        for(int i=0;i<bestSequenceCount;i++){
            System.out.print(bestWord+" ");
        }
    }
}

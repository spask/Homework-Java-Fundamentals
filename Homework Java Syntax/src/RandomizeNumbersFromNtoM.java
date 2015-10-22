import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNtoM {
    public static void main(String[] args) {


        Scanner console=new Scanner(System.in);
        int firstNumber=console.nextInt();
        int secondNumber=console.nextInt();
        int randomNumber=0;
        List<Integer> output= new ArrayList<Integer>();
        while(true) {
            randomNumber=randomWithRange(firstNumber,secondNumber);
            if(output.size()==Math.abs(firstNumber-secondNumber)+1){
                break;
            }
            if(!output.contains(randomNumber)){
                output.add(randomNumber);
            }
        }

        for(Integer number:output){
            System.out.print(number+" ");
        }
    }

    public static int randomWithRange(int number1, int number2) {
        int range = Math.abs(number1 - number2) + 1;
        return (int)(Math.random() * range) + Math.min(number1,number2);
    }
}


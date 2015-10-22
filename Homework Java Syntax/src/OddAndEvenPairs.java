import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String numbers=input.nextLine();
        String[] delimiter=numbers.split(" ");
        int[]arrey=new int[delimiter.length];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i]=Integer.parseInt(delimiter[i]);

        }
        if (arrey.length%2==0){
            System.out.printf("dffrent");
        }else{
            System.out.println("event");
        }


    }
}

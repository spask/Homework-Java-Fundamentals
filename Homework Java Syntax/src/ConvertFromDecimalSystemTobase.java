import java.util.Scanner;

public class ConvertFromDecimalSystemTobase {
    public static void main(String[] args) {
    Scanner oinput=new Scanner(System.in);
        int convertNumber=oinput.nextInt();
        System.out.print(Integer.toString((convertNumber),7));

    }


}

import java.text.MessageFormat;
import java.util.Scanner;

public class FormattingNumbers{
    public static void main(String[] args) {
        Scanner oinput=new Scanner(System.in);
        int a=oinput.nextInt();
        double b=oinput.nextDouble();
        double c=oinput.nextDouble();

        String Hex= String.format(Integer.toHexString(a));

        String formating1 =String.format("%.2f", b);
        String formatin=String.format("%.3f",c);
       String bits=String.format(Integer.toBinaryString(a));

        System.out.println(MessageFormat.format("|{0}        |{1}|     {2}|{3}",Hex,bits,formating1,formatin));

    }
}
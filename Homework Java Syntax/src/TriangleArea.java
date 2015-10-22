import java.lang.reflect.Member;
import java.text.MessageFormat;
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner oinput=new Scanner(System.in);
        String numberX1=oinput.nextLine();
        String[]delimiter=numberX1.split(" ");
        int[]X1=new int[delimiter.length];
        for (int i = 0; i < X1.length; i++) {
            X1[i]=Integer.parseInt(delimiter[i]);

        }
        String numbersX2=oinput.nextLine();
        String[]delimiter2=numbersX2.split(" ");
        int[]X2=new int[delimiter2.length];
        for (int j = 0; j < X2.length; j++) {
            X2[j]=Integer.parseInt(delimiter2[j]);

        }
        String numberX3=oinput.nextLine();
        String []delimiter3=numberX3.split(" ");
        int[]X3=new int[delimiter3.length];
        for (int k = 0; k < X3.length; k++) {
            X3[k]=Integer.parseInt(delimiter3[k]);

        }

        double sum =Math.abs(X1[0]*(X2[1]-X3[1])+X2[0]*(X3[1]-X1[1])+X3[0]*(X1[1]-X2[1]))/2;
        System.out.println((int)sum);
    }
}


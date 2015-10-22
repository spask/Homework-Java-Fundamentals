import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] srgs) {
        Scanner oinput = new Scanner(System.in);
        float a=oinput.nextFloat();
        float b = oinput.nextFloat();
        float c = oinput.nextFloat();
        float sumf1=(float) Math.pow((a * a + b * b)/(a*a-b*b),((a+b+c)/Math.sqrt(c)));
        float sumf2=(float)Math.pow((a*a+b*b-c*c*c),(a-b));
        float dff=(a+b+c)/3;
        float diff1=(sumf1+sumf2)/2;
        float diffrence=Math.abs(dff-diff1);
        System.out.printf("F1 result: %.2f; F2 result: %.2f;Dff: %.2f",sumf1,sumf2,diffrence);
    }
}

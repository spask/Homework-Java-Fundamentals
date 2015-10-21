import java.util.Scanner;
public class GetAverage {

public static void main(String[] args) {
    Scanner oinput=new Scanner(System.in);
    double a=oinput.nextDouble();
    double b=oinput.nextDouble();
    double c=oinput.nextDouble();
    Avarage(a,b,c);

}
    public  static void Avarage(double a,double b,double c){

        double sum=(a+b+c)/3.0;
        System.out.printf("%.2f",sum);
    }
}


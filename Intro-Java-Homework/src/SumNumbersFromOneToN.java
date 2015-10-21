import java.util.Scanner;


public class SumNumbersFromOneToN {

    public static void main(String[] args) {

        Scanner oinput = new Scanner(System.in);
        int n = oinput.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = i * (n + 1) / 2;

        }

        System.out.println(sum);
    }
}



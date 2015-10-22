import java.text.MessageFormat;
import java.util.Scanner;

public class RitangleArea {
    public static void main(String[] args) {
        Scanner oinput = new Scanner((System.in));

        String numbers = oinput.nextLine();
        String[] arr1 = numbers.split(" ");
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arr1[i]);

        }
        System.out.println(arr[0] * arr[1]);
    }
}


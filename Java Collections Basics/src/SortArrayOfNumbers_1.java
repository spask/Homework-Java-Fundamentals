import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int elementsCount = Integer.parseInt(console.nextLine());
        int[] numbers = new int[elementsCount];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}

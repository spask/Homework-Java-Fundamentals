import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortArrayWithStreamAPI_14 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] input = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).sorted().toArray();
        String sortingOrder = console.nextLine();
        if (sortingOrder.equals("Ascending")) {
            for (int i = 0; i < input.length; i++) {
                System.out.print(input[i]+" ");
            }
        }
        if (sortingOrder.equals("Descending")) {
            for (int i = input.length-1; i >= 0; i--) {
                System.out.print(input[i]+" ");
            }
        }
    }
}

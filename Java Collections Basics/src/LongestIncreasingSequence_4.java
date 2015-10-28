import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSequence_4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        List<Integer> temp = new ArrayList<>();
        List<Integer> longest = new ArrayList<>();
        for (int i = 0, k = 1; i < numbers.length ; i++, k++) {
            temp.add(numbers[i]);
            if (k < numbers.length && numbers[i] < numbers[k]) {
                continue;
            } else {

                if (temp.size() > longest.size()) {
                    longest.clear();
                    longest.addAll(temp);
                    printSequence(temp);
                    temp.clear();
                   // longest.clear();
                }else{
                    printSequence(temp);
                    temp.clear();
                }
            }
        }
        System.out.print("Longest: ");
        printSequence(longest);
    }
    static void printSequence(List<Integer> sequence){
        for(Integer number:sequence){
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

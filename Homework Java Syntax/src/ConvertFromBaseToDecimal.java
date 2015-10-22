import javafx.scene.Scene;

import java.util.Scanner;

public class ConvertFromBaseToDecimal {
    public static void main(String[] args) {
        Scanner oinput=new Scanner(System.in);
        String convertNumber=oinput.nextLine();
        System.out.println(Integer.valueOf(convertNumber,7));
    }
}

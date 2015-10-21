import java.text.MessageFormat;

public class AssignVariables {

    public static void main(String[] args) {

    String txt="\"Palo Alto,C\"";
    char charactr='c';
    int numberInt=2000000000;
    byte numberBute=127;
    double numberDouble=0.1234567891011;
    float numberFload=0.5f;
    long numberLong=919827112351L;
    short numberShort=32767;
    System.out.printf(MessageFormat.format(
            "string = {0}\nchar = {1}\nint = {2}\nbute = {3}\ndouble = {4}\nfload = {5}\nlong = {6}\nshort = {7}",
            txt, charactr, numberInt, numberBute
            ,numberDouble+" " ,numberFload,numberLong,numberShort));

}
}

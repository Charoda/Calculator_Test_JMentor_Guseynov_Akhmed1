import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {

        // Здесь реализация ввода данных
Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:\n" +
                "Example1: 1 + 2; 1 * 2; 1 - 2; 1 / 2.  \nExample2: X + IX; X - IX; X * IX; X / IX; ");
String ss = scanner.nextLine();
        //------------------------------------------------------------------------------------------------------

        // Здесь реализация собственно калькулятора.
        Caclulations caclulations = new Caclulations();
      caclulations.setStr(ss);
      caclulations.checkingInputData();
        caclulations.calculator();
      System.out.println();
       //-------------------------------------------------------------------------------------------------------
    }
}

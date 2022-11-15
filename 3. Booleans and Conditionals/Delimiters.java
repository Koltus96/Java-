import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         System.out.println("Enter 2 integers (on the same line) ");
        //  int num1 = scan.nextInt();
        //  int num2 = scan.nextInt();
        String integer = scan.nextLine();

         System.out.println("Enter 2 very big integers (on the same line) ");
        //  long bigNum1 = scan.nextLong();
        //  long bigNum2 = scan.nextLong();
        String bigNumbers = scan.nextLine();

         System.out.println("Enter 2 decimals  (on the same line) ");
        //  double decimal1 = scan.nextDouble();
        //  double decimal2 = scan.nextDouble();
        String decimals = scan.nextLine();

         System.out.println("Enter 2 text values (on the same line) ");
        //  String text1 = scan.next();
        //  String text2 = scan.next();
        String text = scan.nextLine();

         scan.close();

        //  System.out.println("\tIntegers: " + num1 + " " + num2);
        //  System.out.println("\tBig: " + bigNum1 + " " + bigNum2);
        //  System.out.println("\tDecimals: " + decimal1 + " " + decimal2);
        //  System.out.println("\tText: " + text1 + " " + text2);
        System.out.println(integer);
        System.out.println(bigNumbers);
        System.out.println(decimals);
        System.out.println(text);
    }
}

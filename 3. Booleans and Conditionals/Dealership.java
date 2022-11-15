import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java dealership");
        System.out.println("Input 'A' to sell. Input 'B' to buy.");
        
        String option = scan.nextLine();

        switch (option){
            case "A": System.out.println("You chose to Sell"); break; 
            case "B": System.out.println("You chose to Buy"); break;
            default: System.out.println("invalid input"); break;
        }
        scan.close();
        
    }
    
}

import java.util.Scanner;

public class Dealership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Java dealership");
        System.out.println("Input 'A' to buy. Input 'B' to sell.");
        
        String option = scan.nextLine();

        switch (option){
            case "A": System.out.println("\nYou chose to buy"); 
                        System.out.println("\nWhat is your budget?");
                        int budget = scan.nextInt();
                        if (budget >= 10000){
                            System.out.println("\nGreat! A Nissian Ultima is available.");
                            System.out.println("\nDo you have insurance? 'yes' or 'no'");
                            scan.nextLine();
                            String insurance = scan.nextLine();
                            System.out.println("\nDo you have a license? 'yes' or ' no' ");
                            String license = scan.nextLine();
                            System.out.println("\nWhat is your credit score?");
                            int creditScore = scan.nextInt();

                                if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                                    System.out.println("\nSold! Pleasure doing business");
                                } else {
                                    System.out.println("\nSorry you are not eligible");
                                }
                        } else {
                            System.out.println("\nWe dont sell cars under 10k");
                        }
            
            break; 
            case "B": System.out.println("\nYou chose to sell"); 
                        System.out.println("\nWhat is the car valued at?");
                        int value = scan.nextInt();
                        System.out.println("\nWhat is the selling price?");
                        int price = scan.nextInt();

                        if (value > price && price < 30000){
                            System.out.println("\nWe will buy your car. Pleasure doing business");
                        } else {
                            System.out.println("\nWe are not interested");
                        }
            break;
            default: System.out.println("\ninvalid input"); break;
        }
        scan.close();
        
    }
    
}

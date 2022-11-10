import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome. Thank you for taking the survey");
        int counter = 0;

        System.out.println("What is your name?");
        String name = scan.nextLine();
        counter ++;

        System.out.println("How much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter ++;

        System.out.println("How much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter ++;

        System.out.println("How many times per week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter ++;

        System.out.println("How many times per week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter ++;

        scan.close();

        System.out.println("Thank you for answering all " + counter + " questions! \n" + name + " you spend $" + (coffeePrice * coffeeAmount) + " on coffee each week. You also spend $" + (foodPrice * foodAmount) + " on fast food each week." + "\nYour fast food expenses are " + ((foodPrice * foodAmount)/(coffeePrice * coffeeAmount)) + " times more than your coffee expenses");
        }
    
}

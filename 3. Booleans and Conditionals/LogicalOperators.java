public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 67;
        int englishGrade = 65;
        String language = "Java";

        if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
            System.out.println("Congratulations you got the scholarship!");
        } else {
            System.out.println("You did not get the scholarship");
        }

        int credits = 56;
        double GPA = .2;

        if (credits >= 40 && GPA >= 2.0) {
            System.out.println("You earned your diploma!");
        } else { 
           System.out.println("Sorry you need atleast 40 credits and a 2.0 GPA"); 
        }
        
    }
    
}
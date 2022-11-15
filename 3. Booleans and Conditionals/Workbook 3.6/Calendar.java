public class Calendar {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        String day = "Monday"; //Can be any day.
        System.out.println("Hey, are you free on " + day + "? \n");


        System.out.println("Hmm, let me check my calendar.");
        
        //Check 'calendar' here:        
        switch(day){
            case "Monday": System.out.println("I work late Monday"); break;
            case "Tuesday": System.out.println("I have meetings Tuesday"); break;
            case "Wednesday": System.out.println("I go to the dentist on Wednesday"); break; 
            case "Thursday": System.out.println("Thursday is date night"); break;
            case "Friday": System.out.println("Im free Friday"); break;
            case "Saturday": System.out.println("I'm free Saturday"); break;
            case "Sunday": System.out.println("I'm free Sunday"); break;
            default: System.out.println("invalid day"); break;
        }

    }
}

public class WorkSchedule {
    public static void main(String[] args) {
        
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int day = 6;   //3rd day of the week...
        boolean holiday = false;
         // Monday = 1, Sunday =7
        // IF - ELSE IF - ELSE HERE!
        
        if (holiday){
            System.out.println("It's a holiday");
        } else if (day == 6 || day == 7) {
            System.out.println("It's the weekend");
        } else {
            System.out.println("Wake up at 7am");
        }
        
        }

    }

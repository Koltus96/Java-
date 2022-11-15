public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 9;  

        String forecast = "";

        if (temp <= -1) {
            System.out.println("Freezing");
        } else if (temp <= 10){
            System.out.println("Cold");
        } else {
            System.out.println("Warm");
        }

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        
        
        System.out.println(forecast);
    }
}

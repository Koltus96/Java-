public class DocComments {
    public static void main(String[] args) {
        
    }
    /**
     * Function name: greet
     * 
     * Inside the function
     * 1. Prints: Hi
     */
    public static void greet(){
        System.out.println("Hi");
    }
    /**
     * Function name : printText
     * @param name String
     * @param age String 
     * 
     * Inside the function:
     * 1. Prints the name and age 
     */

    public static void printText(String name, String age){
        System.out.println("Hello " + name + " you are " + age + "  years old");
    }
    /**
     * Function name: calculateArea
     * @param length double 
     * @param width double 
     * @return double 
     * 
     * Inside the function:
     * 1. Calculate area using Length and Width 
     */


    public static double calculateArea(double length, double width){ 
        double area = length * width;
        return area;
    }
    
}

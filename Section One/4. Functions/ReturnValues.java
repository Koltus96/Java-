public class ReturnValues {
    public static void main(String[] args) { 
        double area1 = calculateArea(2.3, 3.6);
        printArea(2.3, 3.6, area1);
        // calculateArea(2.3,3.6);
        // calculateArea(1.6,2.4);
        // calculateArea(2.6,4.2);

        String englishExplanation = explainArea("English");
        String frenchExplanation = explainArea("French");
        String spanishExplanation = explainArea("Spanish");
        String defaultExplanation = explainArea("Default");

        System.out.println(englishExplanation);
    }
    
    public static double calculateArea(double length, double width){
        if (length  < 0 || width < 0 ){
            System.out.println("Invalid Dimensions. Dimensions must be positive");
            System.exit(0);
        }
        double area = length * width;
        return area;
        // System.out.println("A rectangle with length: " + length + " and width: " + width + " is: " + area);
    }

    public static String explainArea(String language){
        switch (language){
            case "English": return "Area equals length * width";
            case "French": return "La surface est egale la longueur * la largeur";
            case "Spanish": return "Area es igual a largo * ancho";
            default: return "Language not available";

        }
    
    }

    public static void printArea(double length, double width, double area) {
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + ".");
    }
    
}

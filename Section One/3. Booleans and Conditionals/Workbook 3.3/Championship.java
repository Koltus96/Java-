public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points
        int margin = gryffindor - ravenclaw;

        if (margin > 300){
            System.out.println("First place");
        } else if (margin >= 0) {
            System.out.println("Second place");
        } else if (margin >= -100) {
            System.out.println("Third place");
        } else {
            System.out.println("Fourth place");
        }
        
    }
}

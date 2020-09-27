import java.util.Scanner;
import java.text.DecimalFormat;

class project12{
    public static double pi = 3.1416;

    public static double gallons(double radius, double depth){
        double gallons = pi*(radius*radius)*depth;
        return gallons*7.48;
    }    

    public static void main(String[] args){
        Scanner keyInput = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.printf("Enter the radius in inches: ");
        double radius = keyInput.nextDouble();
        System.out.printf("Enter the depth in feet: ");
        double depth = keyInput.nextDouble();

        double gal = gallons(radius/12, depth);
        System.out.println(df.format(gal) + " gallons");
    }
}
import java.util.Scanner;
import java.text.DecimalFormat;

class project6{
    public static double toCelcius(double f){    
    return (f-32)*0.56;
    }

    public static void main(String[] args){
        double fahrenheit, celcius;

        Scanner keyEntry = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#");
        DecimalFormat def = new DecimalFormat("#");

        System.out.printf("Enter a temperature in degrees Fahrenheit: ");
        fahrenheit = keyEntry.nextDouble();
        
        celcius = toCelcius(fahrenheit);
        System.out.println(def.format(fahrenheit) + " degrees Fahrenheit is " + df.format(celcius) + " degrees Celcius");
    }
}

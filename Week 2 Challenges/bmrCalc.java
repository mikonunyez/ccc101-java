/*
I have improved upon the cleanliness of my code since "changeMaker.java"
*/

/*
The following lines of code imports necessary libraries for the code to run
*/
import java.util.Scanner;
import java.text.DecimalFormat;

class bmrCalc{

    /*
    global variables that the entire code can see
    not the most secure implementation
    */
    double weight, height, maleMaintainingCal, femaleMaintainingCal;
    int age;

    public void userInput(){ //called for user inputs
        Scanner keyInput = new Scanner(System.in);

        System.out.printf("Please enter your weight in pounds (lbs): ");
        weight = keyInput.nextDouble();

        System.out.printf("Please enter your height in inches (in): ");
        height = keyInput.nextDouble();

        System.out.printf("Please enter your age: ");
        age = keyInput.nextInt();
    }

    public void maleBMR(){ //male BMR computation
        maleMaintainingCal = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        System.out.println("Male BMR: " + maleMaintainingCal);
    }

    public void femaleBMR(){ //female BMR computation
        femaleMaintainingCal = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        System.out.println("Female BMR: " + femaleMaintainingCal);
    }

    public void howMuchChocolate(){ //chocolate computation
        /*
        The following line creates a DecimalFormat object
        df allows the code to format numerical outputs
        Helpful for values stored as double
        */
        DecimalFormat df = new DecimalFormat("#.#");

        double chocolateCal = 230;

        System.out.println("If eating chocolate bars alone, these are the number of chocolate bars a person can eat to maintain their weight.");
        System.out.println("For men: " + df.format(maleMaintainingCal/230) + " chocolate bars");
        System.out.println("For women: " + df.format(femaleMaintainingCal/230) + " choclate bars");
        System.out.println("\n\nDisclaimer: This accounts for TOTAL CALORIES ONLY. Protein, fat, and carbs are neglected.");
    }

    public static void main(String[] args){
        /*
        The following line create a new bmrCalc object named as person
        */
        bmrCalc person = new bmrCalc(); 
        person.userInput();
        
        System.out.printf("\n\nRaw calculated BMR data...\n");
        person.maleBMR();
        person.femaleBMR();

        System.out.printf("\n\n");
        person.howMuchChocolate();
    }
}
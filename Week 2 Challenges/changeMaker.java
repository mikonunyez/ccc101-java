import java.util.Scanner;

class changeMaker{
    public static void userInput(){ //called for user inputs
        int input;

        Scanner keyInput = new Scanner(System.in);

        System.out.printf("Enter a whole number from 1 to 10000 (cents)\nI will find a combination of coins that equals that amount of change: ");
        input = keyInput.nextInt();



        /*
        The followign if/else statement serves as a checker
        Ensuring that the user follows instructions
        Users can't be trusted
        */

        if (input>10000 || input<1){
            System.out.println("You have entered an invalid amount. Try again. \n\n");
            userInput();
        }
        else {
            changeCalc(input);
        }
    }

    public static void changeCalc(int amount){ //calculates the change
        int thousands, fiveHundreds, twoHundreds, oneHundreds, quarters, dimes, nickels, pennies, temp;

        temp = amount;

        thousands = temp/1000;
        temp = temp % 1000;

        fiveHundreds = temp/500;
        temp = temp % 500;

        twoHundreds = temp/200;
        temp = temp % 200;

        oneHundreds = temp/100;
        temp = temp % 100;

        quarters = temp/25;
        temp = temp % 25;

        dimes = temp/10;
        temp = temp % 10;

        nickels = temp/5;
        temp = temp % 5;

        pennies = temp/1;

        System.out.println("\n\n" + amount + " cents can be given as:");
        System.out.println(thousands + " thousands");
        System.out.println(fiveHundreds + " five (5) hundreds");
        System.out.println(twoHundreds + " two (2) hunderds");
        System.out.println(oneHundreds + " one (1) hundreds");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels; and");
        System.out.println(pennies + " pennies");
    }

    public static void main(String[] args){
        /*
        I have limited the code that the main method runs
        This is a habit I picked up a while ago
        This should help in the security of data within the code...but for the purposes of this specific code,
            all methods are public... still a good habit in my opinion

        This also reduces the "spaghetti code" effect when everything is under the main method
        Althought it would be better to separate them into classes
        */
        userInput();
    }
}

//signed, Miko
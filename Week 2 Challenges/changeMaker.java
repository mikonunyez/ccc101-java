/*
Refactored the code on Sept 28 to use global variables
instead of declaring new variables that serve the same purpose
*/

import java.util.Scanner;

class changeMaker{
    static int amount;

    //called for user inputs
    public static void userInput(){ 
        Scanner keyInput = new Scanner(System.in);

        System.out.printf("Enter a whole number from 1 to 10000 (cents)\nI will find a combination of denominations that equals that amount of change: ");
        amount = keyInput.nextInt();
    }

    //calculates the change
    public static void changeCalc(){ 
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


    //main method here
    public static void main(String[] args){
        changeMaker coins = new changeMaker();
        coins.userInput();

        if (amount>10000 || amount<1){
            System.out.println("You have entered an invalid amount. Try again. \n\n");
            coins.userInput();
        }
        else {
            coins.changeCalc();
        }
    }
}
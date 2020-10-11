public class Main {
    public static void main(String[] args) {
        boolean a, b, c, d; //temporary variables
        DateChecker date = new DateChecker(); //constructor of object in a user-defined class

        date.userInput();

        while (!date.isInputValid()){
            date.errorMessage();
            System.out.println("Please, try again.\n");
            date.userInput();
        }

        date.parser();
        date.leapYearCheck();


        /*
        The following snippet saves the values of their respective values
        into the temporary variables initiated in the main method

        this ensures that all error checks are done

        shoving them all in a while loop condition will not run every check
         */
        a=date.isMonthValid();
        b=date.isDayAndMonthValid();
        c=date.isDayValid();
        d=date.isFebruaryValid();
        //end of snippet


        /*
        the following while loop checks for errors, based on the temporary variables

        the temporary variables are used in the loop conditions
        in order to prevent unintended multiple calls of the objects
         */
        while (!a || !b || !c || !d || !date.isInputValid()){
            date.errorMessage();
            System.out.println("Please, try again.");
            System.out.println();

            date.userInput();
            date.parser();
            date.leapYearCheck();

            a=date.isMonthValid();
            b=date.isDayAndMonthValid();
            c=date.isDayValid();
            d=date.isFebruaryValid();
        }

        /*
        This returns "valid date" when the while loop (error checker)
        is over, meaning there are no errors
         */
        System.out.println("\nValid date!");
    }
}

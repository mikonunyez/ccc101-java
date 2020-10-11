import java.util.Scanner;

public class DateChecker {
    /*
    all variables within the class are only accessible by the class
     */
    private String input, temp, reasonInvalid;
    private int month, day, year, errorCounter;
    private boolean leapYear=false;


    /*
    the userInput() method is responsible for accepting user input
    and storing it in the String input

    the method also initializes the variables reasonInvalid and errorCounter
     */
    protected void userInput(){
        Scanner keyInput = new Scanner(System.in);

        System.out.println("Enter a date in the format: mm/dd/yyyy");
        input = keyInput.nextLine();
        keyInput.close();
        input=input.trim();

        reasonInvalid = "";
        errorCounter = 0;
    }

    /*
    the parser() method parses input into date variables

    using string indexes and the substring method,
    month, day, and year values are extracted
    and saved to their respective variables
     */
    protected void parser(){
        temp = input.substring(0, 2);
        month = Integer.parseInt(temp);
        System.out.println("Month: " + month);

        temp = input.substring(3, 5);
        day = Integer.parseInt(temp);
        System.out.println("Day: " + day);

        temp = input.substring(6, 10);
        year = Integer.parseInt(temp);
        System.out.println("Year: " + year);
    }

    /*
    the isInputValid checks if the user input is valid
    factors considered are the format, whether or not the user actually included '/'s, etc
     */
    protected boolean isInputValid(){
        if (input.length() != 10){
            reasonInvalid="Incorrect number of characters";
            errorCounter++;
            return false;
        }
        else if(!input.contains("/")){
            reasonInvalid="No '/' found in user input. Please follow the format provided";
            errorCounter++;
            return false;
        }
        else{
            return true;
        }
    }

    /*
    the following method checks if the inputted year
    is a leap year
     */
    protected void leapYearCheck(){
        if (year % 4 == 0){
            leapYear = true;
            System.out.println("Leap year");
        }
        else if ((year % 100 == 0) && (year % 400 == 0)){
            System.out.println("Leap year");
            leapYear = true;
        }
        else{
            System.out.println("Not a leap year");
            leapYear = false;
        }
    }

    /*
    The following 4 methods are responsible for checking if the date inputted is valid
    They are also responsible for including the error messages
     */
    protected boolean isMonthValid(){
        if (month>12){
            reasonInvalid=reasonInvalid.concat("\nInvalid month. There's no month after December");
            errorCounter++;
            return false;
        }
        else{
            return true;
        }
    }

    protected boolean isDayValid(){
        if (day>31){
            reasonInvalid=reasonInvalid.concat("\nThere's only 31 days a month. Unless it's one of those weird months with 30 days..or yknow..February..");
            errorCounter++;
            return false;
        }
        else{
            return true;
        }
    }

    protected boolean isDayAndMonthValid(){
        if (month==4 || month==6 || month==9 || month==11 && day>30){
            reasonInvalid=reasonInvalid.concat("\nThere's only 30 days for April, June, September and November.. unless you live in an alternate universe (bring me with you please)");
            errorCounter++;
            return false;
        }
        else{
            return true;
        }
    }

    protected boolean isFebruaryValid(){
        if (((day==29) && (month==2) && (!leapYear)) || ((day>29 && month==2))){
            reasonInvalid=reasonInvalid.concat("\nThere are only 28 days in February unless it's a leap year. 29 if it's a leap year");
            errorCounter++;
            return false;
        }
        else{
            return true;
        }
    }
    //End of error checkers

    /*
    the errorMessage() method displays all error messages
     */
    protected void errorMessage(){
        System.out.println("There are " + errorCounter + " errors.");
        System.out.println(reasonInvalid);
    }
}

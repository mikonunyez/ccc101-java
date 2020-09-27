import java.util.Scanner;

class project11{
    public static void userInput(){
        String str;

        Scanner keyInput = new Scanner(System.in);
        
        System.out.printf("Please enter a 4-digit binary number: ");
        str = keyInput.nextLine();

        if (str.length() != 4){
            System.out.println("You have entered an invalid number.");
            userInput();
        }
        else{
            binToDec(str);
        }
    }

    public static void binToDec(String binary){
        System.out.println("ParseInt: " + Integer.parseInt(binary,2));   
    }

    public static void main(String[] args){
        userInput();
    }
}
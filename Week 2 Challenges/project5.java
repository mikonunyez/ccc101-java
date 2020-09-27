import java.util.Scanner;

class project5{
    public static void main(String[] args){
        String input;

        Scanner keyEntry = new Scanner(System.in);
    
        System.out.println("Please enter a 4-digit number: ");
        input = keyEntry.nextLine();

        char[] chArray = input.toCharArray();
        
        if (chArray.length!=4){
            System.out.println("You entered an invalid number.");
            System.exit(0);
        }

        for (int i=chArray.length; i>0; i--){
            System.out.println(chArray[i-1]);
        }
    }
}

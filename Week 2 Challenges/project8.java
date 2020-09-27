import java.util.Scanner;

class project8{
    public static String textShuffle(String str){
        int temp;
        String strTemp1, strTemp2, strJoined;

        temp = str.indexOf(" ");
        
        strTemp1 = str.substring(temp+1);
        strTemp2 = str.substring(0,temp);
        strJoined = strTemp1.concat(" ").concat(strTemp2);

        System.out.println(strTemp1 + "\n" + strTemp2 );
        return strJoined;
    }

    public static void main(String[] args){
        String strInput, shuffled;
        Scanner keyEntry = new Scanner(System.in);

        System.out.println("Enter a line of text. No punctuations please.");
        strInput = keyEntry.nextLine();

        shuffled = textShuffle(strInput);

        System.out.println("I have rephrased that line to read:\n" + shuffled);
    }
}
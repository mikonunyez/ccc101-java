import java.util.Scanner;

class project7{
    
    public static String replaceHate(String raw){
        return raw.replaceFirst("hate", "love");
    }

    public static void main(String[] args){
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Input line of text: ");
        String raw = keyInput.nextLine();
        ;
        String processed = replaceHate(raw);

        System.out.println("I have rephrased that line to read:\n" + processed);
    }
}

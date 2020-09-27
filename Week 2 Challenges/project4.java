import java.util.LinkedList;
import java.util.Scanner;

public class project4{
	public static void main(String[] args){
		int input;
		LinkedList<Integer> stack = new LinkedList<Integer>();

		Scanner keyInput = new Scanner(System.in);

		System.out.printf("Please enter a 4-digit number: ");
		input = keyInput.nextInt();

		if (input > 9999){
			System.out.println("Sorry, you have entered an invalid number.");
			System.exit(0);
		}

		else{
			while (input > 0){
				stack.push(input % 10);
				input = input / 10;
			}
			while (!stack.isEmpty()){
				System.out.println(stack.pop());
		
			}
		}
	}
}

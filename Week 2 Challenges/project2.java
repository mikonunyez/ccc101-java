import java.util.Scanner;

public class project2{
	public static void main(String[] args){
		String userIn1, userIn2, str3;

		Scanner stringInput = new Scanner(System.in);

		System.out.println("Please enter 2 strings, separated by a new line (return key):");
		userIn1 = stringInput.nextLine();
		userIn2 = stringInput.nextLine();

		System.out.println("'" + userIn1 + "' has " + userIn1.length() + " characters.");
		System.out.println("'" + userIn2 + "' has " + userIn2.length() + " characters.");

		str3 = userIn1+userIn2;
		System.out.println("'" + str3 + "' has " + str3.length() + " characters.");
	}
}

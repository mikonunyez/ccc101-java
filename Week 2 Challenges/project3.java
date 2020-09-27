import java.util.Scanner;
import java.text.DecimalFormat;

class project3{
	
	public static final  double annualInterest = 0.0749;

	public static void main(String[] args){
		double mortgage, owed, monthlyInterest, temp;

		Scanner keyInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		monthlyInterest = annualInterest/12;

		System.out.printf("Please enter your mortgage: ");
		mortgage = keyInput.nextDouble();
		System.out.printf("Please enter the amount you owe: ");
		owed = keyInput.nextDouble();
		
		temp = mortgage*monthlyInterest;
		
		System.out.println(df.format(temp) + " is the amount that goes to interest");

		temp = mortgage-temp;

		System.out.println(df.format(temp) + " is the amount that goes to principal");
	}
}

import java.util.Scanner;
import java.text.DecimalFormat;

class project1{
	public static void main(String[] args){
		int input1, input2, input3;
		double average;

		DecimalFormat averageDF = new DecimalFormat("#.##");
	
		Scanner keyInput = new Scanner(System.in);

		System.out.println("Please enter three (3) numbers, separated by whitespace: ");
		
		input1 = keyInput.nextInt();
		input2 = keyInput.nextInt();
		input3 = keyInput.nextInt();

		average = ((double)input1 + (double)input2 + (double)input3)/3;

		System.out.println("The average for these numbers is: "+averageDF.format(average));
	}
}

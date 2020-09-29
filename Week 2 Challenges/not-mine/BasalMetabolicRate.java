import java.util.Scanner;
public class BasalMetabolicRate {
    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
     float weight,height,age,bmrg=0,bmrb=0;
     System.out.println("Basal Metabolic Rate");
     System.out.println("Enter Weight in pounds: ");
     weight=sc.nextFloat();
     System.out.println("Enter Height in inches: ");
     height=sc.nextFloat();
     System.out.println("Enter Years of age: ");
     age=sc.nextFloat();
     bmrg=(float) (655 + (4.3*weight) + (4.7*height) - (4.7*age));
     System.out.println("BMR if Girl: "+bmrg);
     bmrb=(float) (66 + (6.3*weight) + (12.9*height) - (6.8*age));
     System.out.println("BMR if Boy: "+bmrb);
    }
}
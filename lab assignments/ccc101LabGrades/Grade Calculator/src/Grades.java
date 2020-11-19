import java.util.Scanner;
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> gradesList = new ArrayList<Integer>();

    protected void userInput(){
        Scanner keyInput = new Scanner(System.in);

        System.out.println("Enter exam scores: (0-100)");

        int temp = 0;
        while (temp >= 0){
            temp = keyInput.nextInt();
            gradesList.add(temp);
        }
        temp = gradesList.size();
        gradesList.remove(temp-1);

        System.out.println("Total number of grades: " + gradesList.size());
    }


    protected void ofA(){
        int numOfA = 0;
        for (int i = 0; i < gradesList.size(); i++){
            if (gradesList.get(i) >= 90 && gradesList.get(i) <= 100){
                numOfA++;
            }
        }

        System.out.println("Number of A's: " + numOfA);
    }


    protected void ofB(){
        int numOfB = 0;
        for (int i = 0; i < gradesList.size(); i++){
            if (gradesList.get(i) >= 80 && gradesList.get(i) <= 89){
                numOfB++;
            }
        }

        System.out.println("Number of B's: " + numOfB);
    }


    protected void ofC(){
        int numOfC = 0;
        for (int i = 0; i < gradesList.size(); i++){
            if (gradesList.get(i) >= 70 && gradesList.get(i) <= 79){
                numOfC++;
            }
        }

        System.out.println("Number of C's: " + numOfC);
    }


    protected void ofD(){
        int numOfD = 0;
        for (int i = 0; i < gradesList.size(); i++){
            if (gradesList.get(i) >= 60 && gradesList.get(i) <= 69){
                numOfD++;
            }
        }

        System.out.println("Number of D's: " + numOfD);
    }


    protected void ofF(){
        int numOfF = 0;
        for (int i = 0; i < gradesList.size(); i++){
            if (gradesList.get(i) <= 59){
                numOfF++;
            }
        }

        System.out.println("Number of B's: " + numOfF);
    }

}

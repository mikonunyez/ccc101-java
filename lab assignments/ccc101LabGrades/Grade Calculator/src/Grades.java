import java.util.Scanner;
import java.util.ArrayList; //required for ArrayLists

// as per usual, 

public class Grades {
    private ArrayList<Integer> gradesList = new ArrayList<Integer>();
    //using an ArrayList easily allows me to crate a dynamic array
    //as this best fits the variable type

    protected void userInput(){
        Scanner keyInput = new Scanner(System.in);

        System.out.println("Enter exam scores: (0-100)");

        int temp = 0; 
        while (temp >= 0){
            temp = keyInput.nextInt();
            gradesList.add(temp); // saves user input into the gradesList ArrayList
        }
        temp = gradesList.size();
        gradesList.remove(temp-1); //removes the last data in the ArrayList. that data is only used to stop the input loop

        System.out.println("Total number of grades: " + gradesList.size());
    }

// the following methods loop through the gradesList ArrayList
// they then compare the grades in there and count them in a counter as they fit a condition
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

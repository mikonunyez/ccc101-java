import java.util.Scanner;

class project9{
    public static void userInfo(String victimName, String favColor, String favAnimal, String favFood){
        System.out.println("I had a dream that " + victimName + " ate a " + favColor + " " + favAnimal + " and said it tasted like " + favFood + );
    }

    public static void main(String[] args){
        String name, color, animal, food;

        Scanner keyInput = new Scanner(System.in);

        System.out.printf("What's your favorite color? ");
        color = keyInput.nextLine();

        System.out.printf("What's your favorite food? ");
        food = keyInput.nextLine();

        System.out.printf("..favorite animal? ");
        animal = keyInput.nextLine();

        System.out.printf("Aight. Give me a name of a friend or a relative: ");
        name = keyInput.nextLine();

        userInfo(name, color, animal, food);
    }
}
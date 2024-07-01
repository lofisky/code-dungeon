import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome traveller, would you like to go down the left or right path?");
        String input = scan.nextLine();
        while(!(input.equalsIgnoreCase("left") || input.equalsIgnoreCase("l") || input.equalsIgnoreCase("right") || input.equalsIgnoreCase("r"))){
            System.out.println("Wrong input. Type left or right");
            input = scan.nextLine();
        }
        if(input.equalsIgnoreCase("left") || input.equalsIgnoreCase("l")){
            System.out.println("You walk down the path on the left. You have encountered a flying frog! Would you like to fight or escape?");
            input = scan.nextLine();
            while(!(input.equalsIgnoreCase("fight") || input.equalsIgnoreCase("f") || input.equalsIgnoreCase("escape") || input.equalsIgnoreCase("e"))){
                System.out.println("Wrong input. Type fight or escape");
                input = scan.nextLine();
            }
            if(input.equalsIgnoreCase("fight") || input.equalsIgnoreCase("f")){
                System.out.println("You slash the flying frog with your iron sword, you gained 10 experience points and 5 gold!");
            }
            else if(input.equalsIgnoreCase("escape") || input.equalsIgnoreCase("e")){
                System.out.println("You walked away from the flying frog. How boring.");
            }
        }
        else if(input.equalsIgnoreCase("right") || input.equalsIgnoreCase("r")){
            System.out.println("You have encountered a giant ogre wielding a mace! Would you like to fight or escape?");
            input = scan.nextLine();
            while(!(input.equalsIgnoreCase("fight") || input.equalsIgnoreCase("f") || input.equalsIgnoreCase("escape") || input.equalsIgnoreCase("e"))){
                System.out.println("Wrong input. Type fight or escape");
                input = scan.nextLine();
            }
            if(input.equalsIgnoreCase("fight") || input.equalsIgnoreCase("f")){
                System.out.println("You swing your sword but the ogre blocks it with its mace and smashes your head in! You died.");
            }
            else if(input.equalsIgnoreCase("escape") || input.equalsIgnoreCase("e")){
                System.out.println("You run away but the ogre chases after you, you quickly climb a tree and the ogre looks up at you unable to follow. What luck! Unfortunately, the ogre decides to camp underneath your tree and you die of hunger and dehydration. The end!");
            }
        }
    }
}



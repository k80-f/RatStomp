/*
*
* Window class that houses methods surronding the player's interaction
* with the terminal. Accessed by the Story class.
*
* @author Katharine Frechette
*
*/

import java.util.Scanner;

public class Window {
    // Create public object scanner of Scanner class
    public Scanner scanner = new Scanner(System.in);
    
    // Method to clear window
    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    // Method to prompt user to continue and clear window
    public void cont(){
        String input = " ";
        
        // Prompts user to continue or quit until correct input is entered, not case sensitive
        System.out.println("");
        System.out.println("");
        System.out.println("Enter C To Continue Or Q To Quit");
        input = scanner.next();
        System.out.println("");

        while(!input.equalsIgnoreCase("C") || input.equalsIgnoreCase("Q")){
            if (input.equalsIgnoreCase("C")) {
                clear();
            }
            else if (input.equalsIgnoreCase("Q"))  {
                System.exit(0);
            }
            else {
                System.out.println("");
                System.out.println("");
                System.out.println("Enter C To Continue Or Q To Quit");
                input = scanner.next();
                System.out.println("");
            }
        }

        //TODO: Add quit option?

    }

    // Method that returns user-inputted ints
    public int inputInt(){
        int input = scanner.nextInt();
        return input;
    }

    // Method that returns user-inputted strings
    public String inputString(){
        String input = scanner.nextLine();
        return input;
    }
}

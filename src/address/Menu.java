/*
 *
 * @author Remi Ngo
 * @since February 2024
 *
 * purpose: To display Menu and prompts for user input
 *
 * */


package address;

import java.util.*;

public class Menu {


    //This displays the Menu for the user to see and decide their actions
    public static void displayMenu(){
        System.out.println("\n\n**********************\nPlease Enter Your Menu Selection: \n a) Loading From File\n b) Adding Entry\n c) Removing Entry\n d) Find Entry\n e) Listing\n f) EXIT\n**********************");
    }

    // Below are prompts used in the "Adding" menu action.

    /*Asks user for first name, takes any input of any type but is converted to String
    * @return user input for first name
    * */
    public static String prompt_FirstName() {
        //Scanner to look for user input
        Scanner input = new Scanner(System.in);
        System.out.println("First Name:");
        //returns the user input
        return input.nextLine();
    }

    /*Asks user for last name, takes any input of any type but is converted to String
    * @return user input for last name
    * */
    public static String prompt_LastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name:");
        return input.nextLine();
    }

    /*Asks user for Street details, takes any input of any type but is converted to String\
    * @return user input for street
    * */
    public static String prompt_Street(){
        Scanner input = new Scanner(System.in);
        System.out.println("Street");
        return input.nextLine();
    }

    /*Asks user for City details, takes any input of any type but is converted to String
    * @return user input for city
    * */
    public static String prompt_City(){
        Scanner input = new Scanner(System.in);
        System.out.println("City:");
        return input.nextLine();
    }

    /*Asks user for State name, takes any input of any type but is converted to String
    * @return user input for state
    * */
    public static String prompt_State(){
        Scanner input = new Scanner(System.in);
        System.out.println("State:");
        return input.nextLine();
    }

    /*Asks user for Zip code, only takes Integer input but is converted to String in the end.
    * @return user input for zip
    * */
    public static String prompt_Zip(){

        //scanner for user input
        Scanner input = new Scanner(System.in);

        //initializing the variable to hold the user input
        int userInput = 0;

        //initializing a variable to check if input is an integer
        boolean isInt = true;

        //"do while" structure to loop until the output is an integer
        do{
            System.out.println("Zip:");

            //breaks out of the loops when the input given is an integer
            if (input.hasNextInt()){
                userInput = input.nextInt();
                isInt = true;
            }
            //continues asking if still not an Integer
            else{
                System.out.println("Please Enter a Number. Zip:");
                input.next();
            }
        }
        while (isInt);

        //converts the integer to a string
        String convert = Integer.toString(userInput);

        //returns the output converted into a string
        return input.nextLine();
    }

    /*Asks user for Telephone number, only takes Integer input but is converted to String in the end.
    * @return user input for telephone
    * */
    public static String prompt_Telephone(){
        Scanner input = new Scanner(System.in);

        int userInput = 0;
        boolean isInt = false;

        do{
            System.out.println("Telephone:");
            if (input.hasNextInt()){
                userInput = input.nextInt();
                isInt = true;
            }
            else{
                System.out.println("Please Enter a Number. Telephone:");
                input.next();
            }
        }
        while (!isInt);

        String convert = Integer.toString(userInput);

        return input.nextLine();
    }

    /*Asks user for first name, takes any input of any type but is converted to String
    * @return user input for email
    * */
    public static String prompt_Email(){
        Scanner input = new Scanner(System.in);
        System.out.println("Email:");
        return input.nextLine();
    }

}

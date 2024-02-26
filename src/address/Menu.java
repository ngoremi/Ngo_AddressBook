package address;

import java.util.*;
public class Menu {

    public static void displayMenu(){
        System.out.println("\n\n**********************\nPlease Enter Your Menu Selection: \n a) Loading From File\n b) Adding Entry\n c) Removing Entry\n d) Find Entry\n e) Listing\n f) EXIT\n**********************");
    }



    public static String prompt_FirstName() {
        Scanner input = new Scanner(System.in);
        System.out.println("First Name:");
        return input.nextLine();
    }

    public static String prompt_LastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Last Name:");
        return input.nextLine();
    }

    public static String prompt_Street(){
        Scanner input = new Scanner(System.in);
        System.out.println("Street");
        return input.nextLine();
    }

    public static String prompt_City(){
        Scanner input = new Scanner(System.in);
        System.out.println("City:");
        return input.nextLine();
    }

    public static String prompt_State(){
        Scanner input = new Scanner(System.in);
        System.out.println("State:");
        return input.nextLine();
    }

    public static String prompt_Zip(){
        Scanner input = new Scanner(System.in);
        System.out.println("Zip:");
        return input.nextLine();
    }

    public static String prompt_Telephone(){
        Scanner input = new Scanner(System.in);
        System.out.println("Telephone:");
        return input.nextLine();
    }

    public static String prompt_Email(){
        Scanner input = new Scanner(System.in);
        System.out.println("Email:");
        return input.nextLine();
    }

}

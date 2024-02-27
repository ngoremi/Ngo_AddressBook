package address;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.*;

class AddressBookApplication {

    public static void main(String[] arg){

        //creates a new address book for every run

        AddressBook ab = new AddressBook();

        //looks for an input for the incoming Menu display
        Scanner input = new Scanner(System.in);


        while (true){

            //displays the Main Menu
            Menu.displayMenu();

            //gets the user input
            String menuInput = input.nextLine();

            //switch structure to perform each action
            switch(menuInput){
                //Loading a File into Address Book
                case "a":
                    Scanner inputFileName = new Scanner(System.in);
                    //asks user for file name
                    System.out.println("Enter File Name: ");
                    String File = inputFileName.nextLine();
                    //performs loading file, takes the filename and the address book
                    ab.loadAddressEntries(ab, File);

                    break;

                //Adding a file into Address Book
                case "b":
                    //creates a new AddressEntry object
                    AddressEntry newEntry = new AddressEntry();

                    //asks user for contact details
                    newEntry.setFirstName(Menu.prompt_FirstName());
                    newEntry.setLastName(Menu.prompt_LastName());
                    newEntry.setStreet(Menu.prompt_Street());
                    newEntry.setCity(Menu.prompt_City());
                    newEntry.setState(Menu.prompt_State());
                    newEntry.setZip(Menu.prompt_Zip());
                    newEntry.setTelephone(Menu.prompt_Telephone());
                    newEntry.setEmail(Menu.prompt_Email());

                    //adds entry into address book
                    ab.addAddressEntry(newEntry);
                    break;

                //Removing a contact
                case "c":
                    //asks the user input for the last name of the contact
                    Scanner removeLastName = new Scanner(System.in);
                    System.out.println("Enter in Last Name of contact to remove:");

                    //uses the findAddressEntry method to find the address first, them performs the removeAddressEntry method
                    ab.removeAddressEntry(ab.findAddressEntry(removeLastName.nextLine()));
                    break;

                //Finding a contact
                case "d":
                    //asks the user input for the last name of the contact they wish to find
                    Scanner findLastName = new Scanner(System.in);
                    System.out.println("Enter in Last Name of contact to find:");

                    //find and hold the entry
                    AddressEntry foundEntry = ab.findAddressEntry(findLastName.nextLine());

                    //as long as the entry exists, print the entry
                    if (foundEntry != null){
                        System.out.println(foundEntry.toString());
                    }
                    break;

                //Listing
                case "e":
                    //lists all the entries in the Address book
                    ab.list();
                    break;

                //Quit out of the program
                case "f":
                    System.out.println("Quitting");
                    System.exit(0);

                //If the user input is not valid
                default:
                    System.out.println("Action does not exist (makes sure it is lower-cased). Try Again!");
            }

        }


    }


}



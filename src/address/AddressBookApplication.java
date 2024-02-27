package address;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import address.data.AddressBook;
import address.data.AddressEntry;

import java.util.*;

class AddressBookApplication {

    public static void main(String[] arg){

        AddressBook ab = new AddressBook();
        Scanner input = new Scanner(System.in);


        while (true){

            Menu.displayMenu();
            String menuInput = input.nextLine();

            switch(menuInput){
                case "a":
                    Scanner inputFileName = new Scanner(System.in);
                    System.out.println("Enter File Name: ");
                    String File = inputFileName.nextLine();
                    ab.loadAddressEntries(ab, File);
                    break;

                case "b":
                    AddressEntry newEntry = new AddressEntry();
                    newEntry.setFirstName(Menu.prompt_FirstName());
                    newEntry.setLastName(Menu.prompt_LastName());
                    newEntry.setStreet(Menu.prompt_Street());
                    newEntry.setCity(Menu.prompt_City());
                    newEntry.setState(Menu.prompt_State());
                    newEntry.setZip(Menu.prompt_Zip());
                    newEntry.setTelephone(Menu.prompt_Telephone());
                    newEntry.setEmail(Menu.prompt_Email());
                    ab.addAddressEntry(newEntry);
                    break;

                case "c":
                    Scanner removeLastName = new Scanner(System.in);
                    System.out.println("Enter in Last Name of contact to remove:");
                    ab.removeAddressEntry(ab.findAddressEntry(removeLastName.nextLine()));
                    break;

                case "d":
                    Scanner findLastName = new Scanner(System.in);
                    System.out.println("Enter in Last Name of contact to find:");
                    AddressEntry foundEntry = ab.findAddressEntry(findLastName.nextLine());
                    if (foundEntry != null){
                        System.out.println(foundEntry.toString());
                    }
                    break;

                case "e":
                    ab.list();
                    break;
                case "f":
                    System.out.println("Quitting");
                    System.exit(0);
                default:
                    System.out.println("Try Again");
            }

        }


    }


}



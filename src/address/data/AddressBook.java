/*
 *
 * @author Remi Ngo
 * @since February 2024
 *
 * purpose: To create an modifiable Address Book
 *
 * */

package address.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class AddressBook {

    //Creates an Address Book using the list structure
    public List<AddressEntry> AddressEntryList;

    /*Creates the list under Address book
    * @return A new Array List object for the Address Book
    * */
    public AddressBook() {
        this.AddressEntryList = new ArrayList<>();
    }

    /*Adds an entry into the address book
    * @param addressEntry is the entry that is intended to be added to the Address book
    * */
    public void addAddressEntry(AddressEntry addressEntry) {
        //uses the add method to into the Address Book
        AddressEntryList.add(addressEntry);

        //resorts the address book entries
        Collections.sort(AddressEntryList, (a,b) -> a.getLastName().compareToIgnoreCase(b.getLastName()));
    }

    /*Removes an entry from the address book
    * @param addressEntry is the entry that is intended to be removed from the Address book
    * */

    public void removeAddressEntry(AddressEntry addressEntry) {
        //uses the remove method
        AddressEntryList.remove(addressEntry);
    }

    /*Finds a contact in the address book
    * @param lastName is the last name of the contact
    * @return addressEntry if the entry exists
    * @return null if the entry doesn't exit
    * */
    public AddressEntry findAddressEntry(String lastName){
        // for loop to look through the address book
        for (AddressEntry addressEntry: AddressEntryList){
            //if a contact is found through the last name, return the entry.
            if (addressEntry.getLastName().equalsIgnoreCase(lastName)){
                return addressEntry;
            }
        }
        //if none is found, print this
        System.out.println("None Found!");
        return null;
    }

    /*Loads all the entries from the Address book
    * @param ab is the Address Book
    * @param filename is the name of the file loaded in
    * */
    public static void loadAddressEntries(AddressBook ab, String filename){

        //initializing the variables to print
        String firstName="", lastName="", street="", city="", state="", zip="", email="", telephone="";

        //try reading the file using BufferReader and FileReader methods
        try(BufferedReader file_input = new BufferedReader(new FileReader(filename))){
            String line;
            //a counter to keep track of every 8 elements and which element
            int elementCounter= 0;

            //initialize an array for the 8 elements
            String[] entryElements = new String[8];

            //while structure to loop until end of file
            while ((line = file_input.readLine()) != null){

                //set the corresponding element to its corresponding index
                entryElements[elementCounter] = line;

                //depending on what corresponding number, set the contact details to element
                switch(elementCounter){
                    case 0:
                        firstName = entryElements[0];
                    case 1:
                        lastName = entryElements[1];
                    case 2:
                        street = entryElements[2];
                    case 3:
                        city = entryElements[3];
                    case 4:
                        state = entryElements[4];
                    case 5:
                        zip = entryElements[5];
                    case 6:
                        email = entryElements[6];
                    case 7:
                        telephone = entryElements[7];
                }
                //increase the counter, make sure current entry doesn't get overwritten
                elementCounter++;

                //if we have all the details of the contact, assemble it into an entry and add to Address book
                if (elementCounter == 8){
                    AddressEntry newEntry = new AddressEntry(firstName, lastName, street, city, state, zip, email, telephone);
                    ab.addAddressEntry(newEntry);

                    //clear out the array
                    Arrays.fill(entryElements,null);

                    //reset the counter
                    elementCounter = 0;
                }
            }
            //let user know it has successfully completed
            System.out.println("Done!");
        }
        //if failed to read the file, output the reason
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    // Lists all the entries in the array
    public void list() {
        //initialize a counter to output the addresses and the number counting before the output
        int counter = 1;

        //checks if the Address book is empty
        if (AddressEntryList.isEmpty()){
            System.out.println("Address Book is Empty!");
        }

        //begins outputting the entries
        else{
            //for loop to go through the entries in the Address book
            for(AddressEntry addressEntry : AddressEntryList){
                //outputs the entries
                System.out.println(counter + addressEntry.toString());
                System.out.println("\n");
                counter++;
            }
        }

    }
}



package address.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class AddressBook {

    public List<AddressEntry> AddressEntryList;

    public AddressBook() {
        this.AddressEntryList = new ArrayList<>();
    }

    public void addAddressEntry(AddressEntry addressEntry) {
        AddressEntryList.add(addressEntry);
        Collections.sort(AddressEntryList, (a,b) -> a.getLastName().compareToIgnoreCase(b.getLastName()));
    }

    public void removeAddressEntry(AddressEntry addressEntry) {
        AddressEntryList.remove(addressEntry);
    }

    public AddressEntry findAddressEntry(String lastName){
        for (AddressEntry addressEntry: AddressEntryList){
            if (addressEntry.getLastName().equalsIgnoreCase(lastName)){
                return addressEntry;
            }
        }
        System.out.println("None Found!");
        return null;
    }

    public static void loadAddressEntries(AddressBook ab, String filename){
        String firstName="", lastName="", street="", city="", state="", zip="", email="", telephone="";
        try(BufferedReader file_input = new BufferedReader(new FileReader(filename))){
            String line;
            int elementCounter= 0;
            String[] entryElements = new String[8];
            while ((line = file_input.readLine()) != null){
                entryElements[elementCounter] = line;
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
                elementCounter++;
                if (elementCounter == 8){
                    AddressEntry newEntry = new AddressEntry(firstName, lastName, street, city, state, zip, email, telephone);
                    ab.addAddressEntry(newEntry);

                    Arrays.fill(entryElements,null);
                    elementCounter = 0;
                }

            }
            System.out.println("Done!");
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    public void list() {
        int counter = 1;
        if (AddressEntryList.isEmpty()){
            System.out.println("Address Book is Empty!");
        }
        else{
            for(AddressEntry addressEntry : AddressEntryList){
                System.out.println(counter + addressEntry.toString());
                System.out.println("\n");
                counter++;
            }
        }

    }
}



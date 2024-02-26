package address.data;

import java.util.*;

public class AddressBook {

    private List<AddressEntry> AddressEntryList;

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

    public void list() {
        int counter = 1;
        if (AddressEntryList.isEmpty()){
            System.out.println("Address Book is Empty!");
        }
        else{
            for(AddressEntry addressEntry : AddressEntryList){
                System.out.println(counter + addressEntry.toString());
                counter++;
            }
        }

    }
}



package data;

import java.util.*;

public class AddressBook {

    public List<AddressEntry> AddressEntryList;

    public AddressBook() {
        this.AddressEntryList = new ArrayList<>();
    }

    public void addAddressEntry(AddressEntry addressEntry) {
        AddressEntryList.add(addressEntry);
    }

    public void list() {
        Iterator<AddressEntry> iterator = AddressEntryList.iterator();
        while (iterator.hasNext()) {
            AddressEntry entry = iterator.next();
            System.out.println(entry.toString());
        }
    }
}

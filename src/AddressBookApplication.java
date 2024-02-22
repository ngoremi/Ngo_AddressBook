//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.io.*;
import java.util.*;
import data.AddressBook;
import data.AddressEntry;

import java.util.*;

class AddressBookApplication {

    public static void main(String arg[]){
        Menu.prompt_FirstName();
        Menu.prompt_LastName();
        Menu.prompt_Street();
        Menu.prompt_City();
        Menu.prompt_State();
        Menu.prompt_Zip();
        Menu.prompt_Telephone();
        Menu.prompt_Email();

        AddressBook ab = new AddressBook();

    }

    static void initAddressBookExercise(AddressBook ab){
        AddressEntry instance1 = new AddressEntry();
        AddressEntry instance2 = new AddressEntry();
        ab.addAddressEntry(instance1);
        ab.addAddressEntry(instance2);

        ab.list();
    }

}



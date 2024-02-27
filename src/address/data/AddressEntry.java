/*
 *
 * @author Remi Ngo
 * @since February 2024
 *
 * purpose: To hold and initialize address entry data
 *
 * */


package address.data;

public class AddressEntry {

    //initializing the contact details
    String firstName, lastName, street, city, state, zip, telephone, email;

    //initializing the Address entry contact details
    public AddressEntry(){
        firstName = getFirstName();
        lastName = getLastName();
        street = getStreet();
        city = getCity();
        state = getState();
        zip = getZip();
        telephone = getTelephone();
        email = getEmail();

    }

    /*used for inputting already set information into an entry, like loading from file
    * @param firstName is the first name, lastName is the last name, street is the street, city is the city, state is the state, zip is the zip, telephone is the phone number, email is the email
    * */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email ){
        //setting the constructors
        setFirstName(firstName);
        setLastName(lastName);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
        setTelephone(telephone);
        setEmail(email);
    }

    //formats the output of the entry
    public String toString(){
        return ": " + getFirstName() + " " + getLastName() + "\n" + getStreet() + "\n"  + getCity() + ", " + getState() + " " + getZip() + "\n" + getEmail() + "\n" + getTelephone();
    }

    //set+get methods for constructors
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

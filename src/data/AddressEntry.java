package data;

public class AddressEntry {
    String firstName, lastName, street, city, state, zip, telephone, email;

    public AddressEntry(){
        firstName = "Jane";
        lastName = "Doe";
        street = "1234";
        city = "Fremont";
        state = "CA";
        zip = "12345";
        telephone = "1234567890";
        email = "xx@email.com";

    }

    public AddressEntry(String firstName, String lastName, String street, String city, String state, String zip, String telephone, String email ){
        setFirstName(firstName);
        setLastName(lastName);
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
        setTelephone(telephone);
        setEmail(email);
    }

    public String toString(){
        return "\n First Name: " + firstName + "\n Last Name: " + lastName + "\n Street: " + street + "\n City:"  + city + "\n State: " + state + "\n Zip: " + zip + "\n Telephone: " + telephone + "\n Email: " + email;
    }

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

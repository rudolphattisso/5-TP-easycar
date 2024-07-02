package fr.afpa;

public class Customer {
    private String fistName;
    private String LastName;
    private String Address;
    private String city;
    private String postalCode;

    //constructeur
    public Customer(String fistName, String lastName, String address, String city, String postalCode) {
        this.fistName = fistName;
        LastName = lastName;
        Address = address;
        this.city = city;
        this.postalCode = postalCode;
    }
    //getters
    public String getFistName() {
        return fistName;
    }
    public String getLastName() {
        return LastName;
    }
    public String getAddress() {
        return Address;
    }
    public String getCity() {
        return city;
    }
    public String getPostalCode() {
        return postalCode;
    }

    //setters
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    
}

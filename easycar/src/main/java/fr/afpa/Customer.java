package fr.afpa;

import java.util.ArrayList;

public class Customer {
    private String fistName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    // cette relation peut être implémentée en ajoutant un attribut permettant
    // de stocker une liste de réservations dans la classe « Customer
    private ArrayList<Reservation> reservations = new ArrayList<>();
    
    // constructeurs
    public Customer(String fistName, String lastName, String address, String city, String postalCode,
            ArrayList<Reservation> reservations) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.reservations = reservations;
    }
    // deuxieme constructeur pour créer un customer. il n'y pas forcement besoin de faire un réservation,
    // d'ou la suppression du tableau.
    public Customer(String fistName, String lastName, String address, String city, String postalCode) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        
    }

    // getter

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }   

    // setter
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setReservations(ArrayList<Reservation> reservations) {
        this.reservations = reservations;
    }


    //fonction représentant les dépenses totales du client;

    public double totalMoneySpend(){
        double totalResult = 0.0;
        for (Reservation reservation : reservations) {
            totalResult += reservation.totalPrice();
        }
        return totalResult ;
    }
    //methode void d'addition de la reservation à un liste qui prends des élements dy type Reservation;
    public void addReservation(Reservation reservation){
        this.reservations.add(reservation);

    }
    //methode permettant de faire retirer des objets de type Reservation de la liste "reservations"
    public boolean removeReservation(Reservation reservation){

        boolean isreservationRemoved = false;

        if(isreservationRemoved = true){
            reservations.remove(reservation);
        }else{
                return false;
            }
        return isreservationRemoved;
        }

}

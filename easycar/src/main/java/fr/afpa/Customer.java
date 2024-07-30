package fr.afpa;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.EOFException;
import java.util.ArrayList;

public class Customer implements Comparable<Customer>, Serializable {
    
    private String fistName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    // cette relation peut être implémentée en ajoutant un attribut permettant
    // de stocker une liste de réservations dans la classe « Customer
    private ArrayList<Reservation> reservations = new ArrayList<>();

    // tp2 Easycar : mettre enplace l'implémentation de l'onterface Comparable

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

    // deuxieme constructeur pour créer un customer. il n'y pas forcement besoin de
    // faire un réservation,
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

    // fonction représentant les dépenses totales du client;

    public double totalMoneySpend() {
        double totalResult = 0.0;
        for (Reservation reservation : reservations) {
            totalResult += reservation.totalPrice();
        }
        return totalResult;
    }

    // methode void d'addition de la reservation à un liste qui prends des élements
    // dy type Reservation;
    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);

    }

    // methode permettant de faire retirer des objets de type Reservation de la
    // liste "reservations"
    public boolean removeReservation(Reservation reservation) {

        boolean isreservationRemoved = false;

        if (isreservationRemoved = true) {
            reservations.remove(reservation);
        } else {
            return false;
        }
        return isreservationRemoved;
    }

    @Override
    public int compareTo(Customer o) {
        // comparer les objets "this" et "o"
        // la comparaison s'effectue sur l'argent total dépensé par le client

        if (this.totalMoneySpend() < o.totalMoneySpend()) {
            return -1;
        }
        if (this.totalMoneySpend() > o.totalMoneySpend()) {
            return 1;
        }

        return 0;

    }

    @Override
    public String toString() {
        return "Customer [fistName=" + fistName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
                + ", postalCode=" + postalCode + ", reservations=" + reservations + ", totalMoneySpend()="
                + totalMoneySpend() + "]";
    }

    public static void serialize(Customer customerToSerialize, String fileName) {
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // sérialisation : écriture de l'objet dans le flux de sortie
            oos.writeObject(customerToSerialize);
            // on vide le tampon
            oos.flush();
            System.out.println(customerToSerialize + " a ete serialise");
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void deserialize(Customer customerToDeserialize, String fileName) {
        try (FileInputStream fileIn = new FileInputStream(fileName);
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            customerToDeserialize = (Customer) in.readObject();
            System.out.println("La désérialisation est terminée. Objet : " + customerToDeserialize);
        } catch (FileNotFoundException fnf) {
            System.err.println("Le fichier n'a pas été trouvé.");
        } catch (EOFException eof) {
            System.err.println("Fin de fichier atteinte.");
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Classe Personne introuvable.");
            c.printStackTrace();
        }

    }
}

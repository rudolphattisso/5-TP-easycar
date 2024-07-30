package fr.afpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vehicule implements Serializable {
    
    private String brand;
    private String model;
    private String color;
    private LocalDate buyingDate;
    private double pricePerDay;
    // Si l’on souhaite retrouver toutes les réservation pour un véhicule, 
    // il est également possible d’ajouter une liste dans la classe « Vehicle » : 
    private transient ArrayList<Reservation> reservations = new ArrayList<>();

    //constructeur
    protected Vehicule(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buyingDate = buyingDate;
        this.pricePerDay = pricePerDay;

        
    }
    //getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBuyingDate() {
        return buyingDate;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;}

    //setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBuyingDate(LocalDate buyingDate) {
        this.buyingDate = buyingDate;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}

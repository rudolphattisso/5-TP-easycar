package fr.afpa;

import java.time.LocalDate;

public abstract class Vehicule {
    
    private String brand;
    private String model;
    private String color;
    private LocalDate buyingDate;
    private double pricePerDay;




    //constructeur
    public Vehicule(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
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

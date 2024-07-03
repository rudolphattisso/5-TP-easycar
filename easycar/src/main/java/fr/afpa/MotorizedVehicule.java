package fr.afpa;

import java.time.LocalDate;

public abstract class MotorizedVehicule extends Vehicule {

    // création de la classe qui ne prendre les valeurs de carburant pour la réutiliser en attribut;
    public enum Fueltype{
        ESSENCE, GASOIL, ELECTRIQUE
    }

    private Fueltype fuelType;
    private int fuelConsumption;
    private boolean integratedGPS;
    
    //constructeur
    protected MotorizedVehicule(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            Fueltype fuelType, int fuelConsumption, boolean integratedGPS) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.integratedGPS = integratedGPS;
    }

    //getters
    public Fueltype getFuelType() {
        return fuelType;
    }


    public int getFuelConsumption() {
        return fuelConsumption;
    }


    public boolean isIntegratedGPS() {
        return integratedGPS;
    }

    //setters
    public void setFuelType(Fueltype fuelType) {
        this.fuelType = fuelType;
    }


    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public void setIntegratedGPS(boolean integratedGPS) {
        this.integratedGPS = integratedGPS;
    }
    
}
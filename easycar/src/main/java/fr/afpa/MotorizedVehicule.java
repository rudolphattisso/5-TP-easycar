package fr.afpa;

import java.time.LocalDate;

public abstract class MotorizedVehicule extends Vehicule {

    private Enum fueltype;
    private int fuelConsumption;
    private boolean integratedGPS;
    

    public MotorizedVehicule(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            Enum fuelType, int fuelConsumption, boolean integratedGPS) {
        //intégration du constructeur de la classe abstraite vehicule par le term super
        super(brand, model, color, buyingDate, pricePerDay);
        this.fueltype = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.integratedGPS = integratedGPS;
    }


    //getters
    public Enum getFuelType() {
        return fueltype;
    }
    public int getFuelConsumption() {
        return fuelConsumption;
    }
    public boolean isIntegratedGPS() {
        return integratedGPS;
    }
    //setters
    public void setFuelType(Enum fuelType) {
        this.fueltype = fuelType;
    }
    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public void setIntegratedGPS(boolean integratedGPS) {
        this.integratedGPS = integratedGPS;
    }
}

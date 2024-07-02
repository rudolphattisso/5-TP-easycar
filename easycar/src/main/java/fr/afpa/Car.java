package fr.afpa;

import java.time.LocalDate;

public class Car extends MotorizedVehicule {

    private int seat;


    public Car(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, Enum fuelType,
            int fuelConsumption, boolean integratedGPS, int seat) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsumption, integratedGPS);
        this.seat = seat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }


    
}

package fr.afpa;

import java.time.LocalDate;

public class Bike extends Vehicule{

    private char size;



    //constructeur créé à partir des attributs d ela classe abstraite tout en rajutant l'attribut de cette classe
    // ensuite renseignat le mot super pour appeler le constructeur de la classe mère(super-classe)
    public Bike(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, char size) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.size = size;
    }
    // getter
    public char getSize() {
        return size;
    }
    //setter
    public void setSize(char size) {
        this.size = size;
    }


}

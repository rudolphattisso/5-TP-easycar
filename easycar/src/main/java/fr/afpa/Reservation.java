package fr.afpa;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation implements Serializable {

    private LocalDate startDate;
    private LocalDate endtDate;
    private boolean paid;
    // la reservation a un lien avec la réservation
    private Vehicule vehicule;

    // constructeur

    public Reservation(LocalDate startDate, LocalDate endtDate, boolean paid, Vehicule vehicule) {
        this.startDate = startDate;
        this.endtDate = endtDate;
        this.paid = paid;
        this.vehicule = vehicule;
    }
    // suppression de l'attribut paid dans le cas ou le client vient dèêtre créé.
    public Reservation(LocalDate startDate, LocalDate endtDate, Vehicule vehicule) {
            this.startDate = startDate;
            this.endtDate = endtDate;
            // la valeur false à été stocker par défaut car on utilisera ce constructeur pour le cas 
            //ou l'on vient de créer un dossier client; il n'a pas encore réservé.
            this.paid = false;
            this.vehicule = vehicule;
    

    }

    // getters
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndtDate() {
        return endtDate;
    }

    public boolean isPaid() {
        return paid;
    }

    // setters
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndtDate(LocalDate endtDate) {
        this.endtDate = endtDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double totalPrice() {
        // déclaration des des dates de début et de fin de la location pour trouver le
        // nombre de jours en entiers;

        double diffInDay = ChronoUnit.DAYS.between(this.startDate, this.endtDate);

        return this.vehicule.getPricePerDay() * diffInDay;
    }

}

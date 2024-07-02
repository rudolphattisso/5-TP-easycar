package fr.afpa;

import java.time.LocalDate;

public class Reservation {
    private LocalDate startDate;
    private LocalDate endtDate;
    private boolean paid;
    
    //constructeur
    public Reservation(LocalDate startDate, LocalDate endtDate, boolean paid) {
        this.startDate = startDate;
        this.endtDate = endtDate;
        this.paid = paid;
    }
    
    //getters
    public LocalDate getStartDate() {
        return startDate;
    }
    public LocalDate getEndtDate() {
        return endtDate;
    }
    public boolean isPaid() {
        return paid;
    }
    //setters
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndtDate(LocalDate endtDate) {
        this.endtDate = endtDate;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    
}

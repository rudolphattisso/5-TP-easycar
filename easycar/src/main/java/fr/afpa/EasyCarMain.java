package fr.afpa;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class EasyCarMain 
{
    public static void main( String[] args )
    {
        Bike bike = new Bike("decat", "riverside", "gris", LocalDate.parse("2023-06-05"), 25.5, 'M');
        Reservation reservation1 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), false, bike);
        Reservation reservation2 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), false, bike);
        // appel du constructeur sans réservation initialement;       
        Customer customer1 = new Customer("zert", "dhru", "rocheron", "Blois", "41000" );

        customer1.addReservation(reservation1);
        customer1.addReservation(reservation2);
        System.out.println(customer1.totalMoneySpend());
        customer1.removeReservation(reservation1);
        System.out.println(reservation1.totalPrice());
        System.out.println(customer1.totalMoneySpend());
        
        

    }
}

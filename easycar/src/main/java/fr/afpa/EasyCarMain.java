package fr.afpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import fr.afpa.MotorizedVehicule.Fueltype;

/**
 * Hello world!
 *
 */
public class EasyCarMain {
    // Creating a logger
    // private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        ArrayList<Customer> customersArray = new ArrayList<>();

        Bike bike = new Bike("decat", "riverside", "gris", LocalDate.parse("2023-06-05"), 25.5, 'M');
        Truck truck = new Truck("zerk", "zamoun", "blue", LocalDate.parse("2023-06-07"), 45.3, Fueltype.ESSENCE, 20,
                true, 90.3);
        Reservation reservation1 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), true,
                bike);
        Reservation reservation2 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), false,
                truck);
        Reservation reservation3 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), true,
                truck);
        Reservation reservation4 = new Reservation(LocalDate.parse("2023-06-05"), LocalDate.parse("2023-06-13"), true,
                bike);
        // appel des constructeur avec et sans réservations;
        Customer customer1 = new Customer("zert", "dhru", "rocheron", "Blois", "41000");
        Customer customer2 = new Customer("ziru", "ryr", "rue appel", "Blois", "41000");
        Customer customer3 = new Customer("ziru", "ryr", "rue appel", "Blois", "41000");
        Customer customer4 = new Customer("irz", "rart", "zup", "Blois", "41000");

        customer1.addReservation(reservation1);
        customer1.addReservation(reservation2);
        customer1.addReservation(reservation3);
        customer2.addReservation(reservation3);
        customer2.addReservation(reservation4);
        customer3.addReservation(reservation4);
        customer3.addReservation(reservation4);
        customer3.addReservation(reservation1);
        customer4.addReservation(reservation3);
        customer4.addReservation(reservation2);
        customer4.addReservation(reservation3);
        customer4.addReservation(reservation1);

        System.out.println(customer1.totalMoneySpend());

        // customer1.removeReservation(reservation1);
        // System.out.println("le total pour le client 1 est: " +
        // reservation1.totalPrice());
        System.out.println("le total pour le client 1 est: " + customer1.totalMoneySpend());
        System.out.println("le total pour le client 2 est: " + customer2.totalMoneySpend());
        System.out.println("le total pour le client 3 est: " + customer3.totalMoneySpend());
        System.out.println("le total pour le client 4 est: " + customer4.totalMoneySpend());

        customersArray.add(customer1);
        customersArray.add(customer2);
        customersArray.add(customer3);
        customersArray.add(customer4);

        Collections.sort(customersArray);
        for (Customer customer: customersArray) {
           System.out.println(customer.totalMoneySpend());
        }
        
        Customer.serialize(customer1);
        Customer.serialize(customer2);
        Customer.serialize(customer3);

        Customer.deserialize(customer1);
        Customer.deserialize(customer2);
        Customer.deserialize(customer3);
        Customer.deserialize(customer4);

    }

}

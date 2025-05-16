package Assignments.Assignment1Solution;

public class Test {
    public static void main(String[] args) {
        Service service = new Service();

        // Add cars
        service.addCar(new Car(101, "Toyota Corolla", "Hatchback", true));
        service.addCar(new Car(102, "Honda Civic", "Sedan", true));

        // Register customers
        service.registerCustomer(new Customer("C001", "Alice", "1234567890"));
        service.registerCustomer(new Customer("C002", "Bob", "9876543210"));

        // Rent a car
        service.rentCar("C001", 101);

        // View available cars
        service.viewAvailableCars();

        // View all bookings
        service.viewAllBookings();

        // Return a car
        service.returnCar(101);

        // View bookings again
        service.viewAllBookings();

        // View all customers
        service.viewAllCustomers();
    }
}
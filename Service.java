package Assignments.Assignment1Solution;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private List<Customer> customers = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();
    private List<Car> cars = new ArrayList<>();
    private int bookingCounter = 1;

    public void addCar(Car car) {
        cars.add(car);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(String customerId, int carId) {
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getCustomerId().equals(customerId)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        for (Car car : cars) {
            if (car.getCarId() == carId && car.isAvailable()) {
                car.setAvailable(false);
                Booking booking = new Booking(bookingCounter++, customer, car);
                bookings.add(booking);
                System.out.println("Car rented successfully.");
                return;
            }
        }

        System.out.println("Car not available.");
    }

    public void returnCar(int carId) {
        for (Booking booking : bookings) {
            if (booking.getCar().getCarId() == carId && !booking.getCar().isAvailable()) {
                booking.getCar().setAvailable(true);
                booking.setReturnDate(LocalDate.now());
                System.out.println("Car returned successfully.");
                return;
            }
        }

        System.out.println("Booking not found or car already returned.");
    }

    public void viewAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : cars) {
            if (car.isAvailable()) {
                car.displayInfo();
                System.out.println("---------------------");
            }
        }
    }

    public void viewAllBookings() {
        System.out.println("All Bookings:");
        for (Booking booking : bookings) {
            booking.displayInfo();
            System.out.println("---------------------");
        }
    }

    public void viewAllCustomers() {
        System.out.println("Registered Customers:");
        for (Customer customer : customers) {
            customer.display();
            System.out.println("---------------------");
        }
    }
}

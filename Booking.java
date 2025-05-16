package Assignments.Assignment1Solution;

import java.time.LocalDate;

public class Booking {
    private int bookingID;
    private LocalDate bookingDate;
    private LocalDate returnDate;
    private Car car;
    private Customer customer;

    public Booking(int bookingID, Customer customer, Car car) {
        this.bookingID = bookingID;
        this.customer = customer;
        this.car = car;
        this.bookingDate = LocalDate.now();
    }

    public int getBookingID() {
        return bookingID;
    }

    public Car getCar() {
        return car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void displayInfo() {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Car: " + car.getCarModel());
        System.out.println("Booking Date: " + bookingDate);
        System.out.println("Return Date: " + returnDate);
    }
}
package Assignments.Assignment1Solution;

public class Car {
        private int carId;
        private String carModel;
        private String carType;
        private boolean isAvailable;

        public Car(int carId, String carModel, String carType, boolean isAvailable) {
            this.carId = carId;
            this.carModel = carModel;
            this.carType = carType;
            this.isAvailable = isAvailable;
        }

        public int getCarId() {
            return carId;
        }

        public String getCarModel() {
            return carModel;
        }

        public String getCarType() {
            return carType;
        }

        public boolean isAvailable() {
            return isAvailable;
        }

        public void setAvailable(boolean available) {
            this.isAvailable = available;
        }

        public void displayInfo() {
            System.out.println("Car ID: " + carId);
            System.out.println("Model: " + carModel);
            System.out.println("Type: " + carType);
            System.out.println("Available: " + isAvailable);
        }
}



package Challenge2;

public class Car extends Vehicle {
    private int numberOfDoors;

    // Constructor for Car
    public Car(String make, String model, double rentalPrice, int numberOfDoors) {
        super(make, model, rentalPrice);
        this.numberOfDoors = numberOfDoors;
    }

    // Getter and setter methods for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("numberOfDoors: " + numberOfDoors);
    }


}

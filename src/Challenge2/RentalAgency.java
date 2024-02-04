package Challenge2;

import java.util.ArrayList;
public class RentalAgency {

    private ArrayList<Vehicle> fleet;

    //constructor

    public RentalAgency() {
        this.fleet = new ArrayList<>();
    }
    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }
    // Method to rent a vehicle
    public void rentVehicle(Vehicle vehicle){
        System.out.println("renting the following vehicle:");
        vehicle.displayInfo();
        System.out.println("Rental Cost: $" + vehicle.getRentalPrice());
        System.out.println("Vehicle successfully rented!");
    }
    public void displayAvailableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : fleet) {
            vehicle.displayInfo();
            System.out.println("---------------");
        }
    }





}

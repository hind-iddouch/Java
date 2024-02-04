package Challenge2;

public class MainVehicle {
    public static void main(String[] args) {
        Car car1= new Car("Toyota","Camry",50.0,5);
        Bike bike1= new Bike("Schwinn","Cruiser",20.0,true);

        RentalAgency rentalAgency= new RentalAgency();

        rentalAgency.addVehicle(car1);
        rentalAgency.addVehicle(bike1);

        rentalAgency.displayAvailableVehicles();

        rentalAgency.rentVehicle(car1);


    }
}

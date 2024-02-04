package Challenge2;

public class Vehicle {

private String make;
private String model;
private double rentalPrice;
public Vehicle(String make,String model,double rentalPrice){
    this.make=make;
    this.model=model;
    this.rentalPrice=rentalPrice;
}
public String getMake(){
    return make;
}public String getModel(){
        return model;
    }public double getRentalPrice(){
        return rentalPrice;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    // Display information method
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: $" + rentalPrice);
    }

}

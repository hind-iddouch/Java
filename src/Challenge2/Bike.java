package Challenge2;

public class Bike extends Vehicle {
    private boolean hasBasket;
    // Constructor
    public Bike(String make, String model,double rentalPrice,boolean hasBasket){
        super(make,model,rentalPrice);
        this.hasBasket= hasBasket;
    }
// Getter and setter methods
    public boolean hasbasket(){
        return hasBasket;

    }
    public void setHasBasket(boolean hasBasket){
        this.hasBasket=hasBasket;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Has Basket: "+(hasBasket ?"yes":"no"));
    }

}

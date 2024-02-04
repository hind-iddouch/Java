package Challenge3;

// Abstract Class: Shape
abstract class Shape implements Drawable {
    private String shapeType;

    // Constructor
    public Shape(String shapeType) {
        this.shapeType= shapeType;
    }
    // Concrete method
    public void displayShapeType(){
        System.out.println("Shape Type: " + shapeType);
    }
    @Override
    public void drawShape() {
        System.out.println("Drawing a " + shapeType);
    }
}

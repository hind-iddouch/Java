package Challenge3;

// Concrete Subclass: Rectangle
class Square extends Shape {
    private double side;


    // Constructor

    public Square(String shapeType, double side) {
        super(shapeType);
        this.side = side;
    }

    // Implementing the draw method from the interface
    @Override
    public void drawShape() {
        super.displayShapeType();
        System.out.println("Drawing a square with side length " + side);
    }
}


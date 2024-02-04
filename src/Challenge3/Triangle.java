package Challenge3;

// Concrete Subclass: Circle
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor for Triangle with shapeType parameter
    public Triangle(String shapeType, double base, double height) {
        super(shapeType);
        this.base = base;
        this.height = height;
    }
    // Specific implementation for drawing a triangle
    @Override
    public void drawShape() {
        super.displayShapeType();
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

}
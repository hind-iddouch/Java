package Challenge3;

public class Main {
    public static void main(String[] args) {
        // Create instances of Triangle and Square
        Triangle triangle = new Triangle("Equilateral", 5.0, 8.0);
        Square square = new Square("Regular", 4.0);

        // Create a DrawingBoard
        DrawingBoard drawingBoard = new DrawingBoard();

        // Add shapes to the drawing board
        drawingBoard.addShape(triangle);
        drawingBoard.addShape(square);

        // Display and draw the shapes on the drawing board
        drawingBoard.displayAndDrawShapes();
    }
}

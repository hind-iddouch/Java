package Challenge3;

import java.util.ArrayList;

public class DrawingBoard {
    private ArrayList<Drawable>shapes;

    // Constructor


    public DrawingBoard() {
        this.shapes = new ArrayList<>();
    }
    // Method to add a shape to the drawing board
    public void addShape(Drawable shape) {
        shapes.add(shape);
    }
    // Method to display and draw each shape on the drawing board
    public void displayAndDrawShapes() {
        for (Drawable shape : shapes) {
            shape.drawShape();
            System.out.println(); // Add a newline for better separation
        }
    }

}

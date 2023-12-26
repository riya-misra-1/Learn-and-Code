import java.io.FileWriter;
import java.io.IOException;

public class AreaCalculator {
    
     public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        AreaCalculator calculator = new AreaCalculator();
        double area = calculator.calculateArea(rectangle);
        calculator.saveAreaToFile(area);
        System.out.println("Area: " + area);

    }

    public double calculateArea(Rectangle rectangle) {
        return rectangle.getLengthOfRectangle() * rectangle.getWidthOfRectangle();
    }
   
   public void saveAreaToFile(double area) {
        try (FileWriter writer = new FileWriter("area.txt")) {
            writer.write("Area: " + area);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
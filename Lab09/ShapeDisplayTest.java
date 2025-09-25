package Lab09;

/**
 * Test class demonstrating the Bridge pattern implementation
 * Shows how shapes can be drawn using different output formats
 */
public class ShapeDisplayTest {
    
    public static void main(String[] args) {
        System.out.println("=== Bridge Pattern Demo: Shape Display System ===\n");
        
        // Create different output formats
        OutputFormat screen = new Screen();
        OutputFormat printer = new Printer();
        OutputFormat xmlWriter = new XmlWriter();
        
        System.out.println("1. Creating shapes with different output formats:");
        System.out.println("------------------------------------------------");
        
        // Create shapes with different output formats
        Shape circle1 = new Circle(10, 20, 5, screen);
        Shape rectangle1 = new Rectangle(0, 0, 10, 15, printer);
        Shape polygon1 = new Polygon(new int[]{0, 10, 5}, new int[]{0, 0, 10}, xmlWriter);
        
        // Draw shapes
        System.out.println("\nDrawing circle on screen:");
        circle1.draw();
        
        System.out.println("\nDrawing rectangle on printer:");
        rectangle1.draw();
        
        System.out.println("\nDrawing triangle polygon in XML format:");
        polygon1.draw();
        
        System.out.println("\n2. Changing output formats at runtime:");
        System.out.println("-------------------------------------");
        
        // Demonstrate runtime format switching
        System.out.println("\nSwitching circle from screen to XML writer:");
        circle1.setOutputFormat(xmlWriter);
        circle1.draw();
        
        System.out.println("\nSwitching rectangle from printer to screen:");
        rectangle1.setOutputFormat(screen);
        rectangle1.draw();
        
        System.out.println("\n3. Creating complex polygon and testing all formats:");
        System.out.println("--------------------------------------------------");
        
        // Create a more complex polygon (pentagon)
        int[] xPoints = {50, 61, 98, 23, 2};
        int[] yPoints = {0, 35, 35, 90, 90};
        Shape pentagon = new Polygon(xPoints, yPoints, screen);
        
        System.out.println("\nPentagon on screen:");
        pentagon.draw();
        
        System.out.println("\nPentagon on printer:");
        pentagon.setOutputFormat(printer);
        pentagon.draw();
        
        System.out.println("\nPentagon in XML format:");
        pentagon.setOutputFormat(xmlWriter);
        pentagon.draw();
        
        System.out.println("\n4. Testing all combinations:");
        System.out.println("---------------------------");
        
        // Test all shape-format combinations
        Shape[] shapes = {
            new Circle(100, 100, 25, screen),
            new Rectangle(50, 50, 150, 100, screen),
            new Polygon(new int[]{0, 20, 20, 0}, new int[]{0, 0, 20, 20}, screen)
        };
        
        OutputFormat[] formats = {screen, printer, xmlWriter};
        String[] formatNames = {"Screen", "Printer", "XML Writer"};
        String[] shapeNames = {"Circle", "Rectangle", "Square Polygon"};
        
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("\n" + shapeNames[i] + " with different formats:");
            for (int j = 0; j < formats.length; j++) {
                System.out.println("  " + formatNames[j] + ":");
                shapes[i].setOutputFormat(formats[j]);
                shapes[i].draw();
            }
        }
        
        System.out.println("\n=== Bridge Pattern Demo Complete ===");
        System.out.println("\nKey Benefits Demonstrated:");
        System.out.println("- Shapes and output formats can vary independently");
        System.out.println("- New shapes can be added without changing output formats");
        System.out.println("- New output formats can be added without changing shapes");
        System.out.println("- Output format can be changed at runtime");
    }
}

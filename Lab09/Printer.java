package Lab09;

/**
 * Printer output format implementation
 * Concrete implementor in the Bridge pattern
 */
public class Printer implements OutputFormat {
    
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Printer: Printing line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
    
    @Override
    public void drawPixel(int x, int y) {
        System.out.println("Printer: Printing pixel at (" + x + "," + y + ")");
    }
    
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Printer: Printing circle at (" + x + "," + y + ") with radius " + radius);
    }
}

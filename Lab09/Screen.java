package Lab09;

/**
 * Screen output format implementation
 * Concrete implementor in the Bridge pattern
 */
public class Screen implements OutputFormat {
    
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("Screen: Drawing line from (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ")");
    }
    
    @Override
    public void drawPixel(int x, int y) {
        System.out.println("Screen: Drawing pixel at (" + x + "," + y + ")");
    }
    
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Screen: Drawing circle at (" + x + "," + y + ") with radius " + radius);
    }
}

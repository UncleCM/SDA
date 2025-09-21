package Lab09;

/**
 * Rectangle shape implementation
 * Refined abstraction in the Bridge pattern
 */
public class Rectangle extends Shape {
    private int x1, y1, x2, y2;
    
    public Rectangle(int x1, int y1, int x2, int y2, OutputFormat outputFormat) {
        super(outputFormat);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void draw() {
        // Draw rectangle by drawing four lines
        outputFormat.drawLine(x1, y1, x2, y1); // Top line
        outputFormat.drawLine(x2, y1, x2, y2); // Right line
        outputFormat.drawLine(x2, y2, x1, y2); // Bottom line
        outputFormat.drawLine(x1, y2, x1, y1); // Left line
    }
    
    // Getters and setters
    public int getX1() { return x1; }
    public void setX1(int x1) { this.x1 = x1; }
    
    public int getY1() { return y1; }
    public void setY1(int y1) { this.y1 = y1; }
    
    public int getX2() { return x2; }
    public void setX2(int x2) { this.x2 = x2; }
    
    public int getY2() { return y2; }
    public void setY2(int y2) { this.y2 = y2; }
}

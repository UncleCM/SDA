package Lab09;

/**
 * Circle shape implementation
 * Refined abstraction in the Bridge pattern
 */
public class Circle extends Shape {
    private int x, y, radius;
    
    public Circle(int x, int y, int radius, OutputFormat outputFormat) {
        super(outputFormat);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        outputFormat.drawCircle(x, y, radius);
    }
    
    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
}

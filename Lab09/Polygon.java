package Lab09;

/**
 * Polygon shape implementation
 * Refined abstraction in the Bridge pattern - demonstrates extensibility
 */
public class Polygon extends Shape {
    private int[] xPoints;
    private int[] yPoints;
    private int numPoints;
    
    public Polygon(int[] xPoints, int[] yPoints, OutputFormat outputFormat) {
        super(outputFormat);
        if (xPoints.length != yPoints.length) {
            throw new IllegalArgumentException("X and Y point arrays must have the same length");
        }
        this.xPoints = xPoints.clone();
        this.yPoints = yPoints.clone();
        this.numPoints = xPoints.length;
    }
    
    @Override
    public void draw() {
        // Draw polygon by connecting consecutive points with lines
        for (int i = 0; i < numPoints; i++) {
            int nextIndex = (i + 1) % numPoints; // Connect last point to first
            outputFormat.drawLine(xPoints[i], yPoints[i], xPoints[nextIndex], yPoints[nextIndex]);
        }
    }
    
    // Getters
    public int[] getXPoints() { return xPoints.clone(); }
    public int[] getYPoints() { return yPoints.clone(); }
    public int getNumPoints() { return numPoints; }
}

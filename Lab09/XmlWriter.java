package Lab09;

/**
 * XML Writer output format implementation
 * Concrete implementor in the Bridge pattern - demonstrates extensibility
 */
public class XmlWriter implements OutputFormat {
    
    @Override
    public void drawLine(int x1, int y1, int x2, int y2) {
        System.out.println("<line x1=\"" + x1 + "\" y1=\"" + y1 + "\" x2=\"" + x2 + "\" y2=\"" + y2 + "\" />");
    }
    
    @Override
    public void drawPixel(int x, int y) {
        System.out.println("<pixel x=\"" + x + "\" y=\"" + y + "\" />");
    }
    
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"" + radius + "\" />");
    }
}

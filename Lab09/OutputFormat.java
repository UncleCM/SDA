package Lab09;

/**
 * Interface for different output formats (Screen, Printer, etc.)
 * This is the implementor in the Bridge pattern
 */
public interface OutputFormat {
    void drawLine(int x1, int y1, int x2, int y2);
    void drawPixel(int x, int y);
    void drawCircle(int x, int y, int radius);
}

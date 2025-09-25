package Lab09;

/**
 * Abstract Shape class that uses the Bridge pattern to separate
 * shape abstraction from output format implementation
 */
public abstract class Shape {
    protected OutputFormat outputFormat;
    
    public Shape(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }
    
    public void setOutputFormat(OutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }
    
    public abstract void draw();
}

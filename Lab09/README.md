# Bridge Pattern Implementation - Shape Display System

## Overview
This implementation demonstrates the Bridge design pattern through a shape display system that can render shapes in multiple output formats.

## Pattern Structure

### Abstraction Layer
- **Shape** (abstract class): Defines the abstraction interface and maintains a reference to an OutputFormat implementor

### Refined Abstractions
- **Circle**: Concrete shape that draws circles
- **Rectangle**: Concrete shape that draws rectangles  
- **Polygon**: Concrete shape that draws polygons with multiple points

### Implementor Interface
- **OutputFormat**: Defines the interface for concrete implementors

### Concrete Implementors
- **Screen**: Outputs shapes to screen (console)
- **Printer**: Outputs shapes to printer (simulated)
- **XmlWriter**: Outputs shapes as XML markup

## Key Benefits Demonstrated

1. **Independence**: Shapes and output formats can vary independently
2. **Extensibility**: New shapes can be added without modifying output formats, and vice versa
3. **Runtime Flexibility**: Output format can be changed at runtime
4. **Open/Closed Principle**: Open for extension, closed for modification

## Files Structure

```
Lab09/
├── Shape.java              # Abstract shape class (Abstraction)
├── Circle.java             # Circle implementation (Refined Abstraction)
├── Rectangle.java          # Rectangle implementation (Refined Abstraction)
├── Polygon.java            # Polygon implementation (Refined Abstraction)
├── OutputFormat.java       # Output format interface (Implementor)
├── Screen.java             # Screen output (Concrete Implementor)
├── Printer.java            # Printer output (Concrete Implementor)
├── XmlWriter.java          # XML output (Concrete Implementor)
├── ShapeDisplayTest.java   # Test class demonstrating the pattern
├── BridgePattern.mmd       # UML class diagram in Mermaid format
└── README.md               # This documentation
```

## How to Run

1. Compile all Java files:
   ```bash
   javac Lab09/*.java
   ```

2. Run the test class:
   ```bash
   java Lab09.ShapeDisplayTest
   ```

## Example Usage

```java
// Create different output formats
OutputFormat screen = new Screen();
OutputFormat printer = new Printer();
OutputFormat xmlWriter = new XmlWriter();

// Create shapes with different output formats
Shape circle = new Circle(10, 20, 5, screen);
Shape rectangle = new Rectangle(0, 0, 10, 15, printer);

// Draw shapes
circle.draw();      // Outputs to screen
rectangle.draw();   // Outputs to printer

// Change output format at runtime
circle.setOutputFormat(xmlWriter);
circle.draw();      // Now outputs as XML
```

## Pattern Benefits in This Implementation

1. **Decoupling**: Shape logic is separated from output format logic
2. **Flexibility**: Any shape can use any output format
3. **Maintainability**: Changes to output formats don't affect shapes
4. **Testability**: Each component can be tested independently
5. **Reusability**: Output formats can be reused across different shapes

This implementation fulfills the requirement to "design a system which allows new shapes and new output formats to be added easily" by using the Bridge pattern to separate the shape abstraction from the output format implementation.

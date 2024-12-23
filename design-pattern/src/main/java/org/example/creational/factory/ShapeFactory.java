package org.example.creational.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }
        if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }
        if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}

package design_patterns.creational_pattern.factory_pattern.ShapeExample;

import design_patterns.creational_pattern.factory_pattern.ShapeExample.Shape;
import design_patterns.creational_pattern.factory_pattern.ShapeExample.Shapes.Circle;
import design_patterns.creational_pattern.factory_pattern.ShapeExample.Shapes.Rectangle;
import design_patterns.creational_pattern.factory_pattern.ShapeExample.Shapes.Square;

public class ShapeFactory {

    Shape getShape(String input){

        switch(input){
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}

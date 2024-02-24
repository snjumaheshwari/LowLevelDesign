package design_patterns.creational_pattern.factory_pattern.ShapeExample;

public class Main {
    public static void main( String args[]){

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapeObj = shapeFactory.getShape("CIRCLE");

        shapeObj.draw();

        Shape shapeObj_1 = shapeFactory.getShape("SQUARE");

        shapeObj_1.draw();

        Shape shapeObj_2 = shapeFactory.getShape("RECTANGLE");

        shapeObj_2.draw();

        // Factory Pattern is used to create object on the basis of condition

    }
}

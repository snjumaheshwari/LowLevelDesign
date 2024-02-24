package design_patterns.creational_pattern.factory_pattern.ShapeExample.Shapes;


import design_patterns.creational_pattern.factory_pattern.ShapeExample.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println(" Drawing Rectangle");
    }
}

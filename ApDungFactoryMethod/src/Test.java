public class Test {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shapCircle = shapeFactory.getShape("circle");
        Shape shapeRectangle = shapeFactory.getShape("rectangle");
        Shape shapeSquare = shapeFactory.getShape("square");
        shapCircle.draw();
        shapeRectangle.draw();
        shapeSquare.draw();
    }
}

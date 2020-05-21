public class ShapeFactory {
    public Shape getShape(String type){
       if ("circle".equals(type)){
           return new Circle();
       }else if ("rectangle".equals(type)){
           return new Rectangle();
       }else return new Square();
    }
}

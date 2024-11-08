public class Client{
    public static void main(String args[]){
        Circle circle = new Circle();
        circle.setXY(10, 2);
        circle.setColor("Dark");
        circle.setType("circle");
        circle.setDimensions(23);
        
        Rectangle rect = new Rectangle();
        rect.setXY(11,11);
        rect.setColor("Light");
        rect.setType("rectangle");
        rect.setDimensions(11, 12);

        Circle clonedCircle = (Circle) circle.clone();

        circle.isEqual(clonedCircle);
        circle.isEqual(rect);
    }
}
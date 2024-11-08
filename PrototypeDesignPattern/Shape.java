public abstract class Shape{
    private String color;
    private int x;
    private int y;
    private String type;
    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
            this.type = target.type;
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    public abstract Shape clone();
    public void isEqual(Shape obj){
        if(!( obj instanceof Shape)) System.out.println("Shapes are not same.");
        Shape shape1 = (Shape) obj;
        System.out.println(shape1.type + " "+ type);
        if(type == shape1.type) {
            System.out.println("Shapes are same.");
            if(x == shape1.x && y == shape1.y && color == shape1.color) System.out.println("x,y and colors are also same");
            else System.out.println("Shapes can be same but x,y and color is not.");
        }
        else System.out.println("Shapes are not same.");
        
    }
}
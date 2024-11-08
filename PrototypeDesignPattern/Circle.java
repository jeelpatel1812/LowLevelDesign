public class Circle extends Shape{

    private int radius;
    public Circle() {
        super();
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    public void setDimensions(int r){
        this.radius = r;
    }

    public Shape clone(){
        return new Circle(this);
    }

}
public class Rectangle extends Shape{

    private int height;
    private int width;
    public Rectangle() {
        super();
    }


    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    public void setDimensions(int h, int w){
        this.height = h;
        this.width = w;
    }

    public Shape clone(){
        return new Rectangle(this);
    }
}
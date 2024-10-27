public class AnimalIRobot implements IRobot {
    private String type;
    private String spriteImage;

    private double x, y;

    AnimalIRobot(String type, String spriteImage) {
        this.spriteImage = spriteImage;
        this.type = type;
    }

    public void getDetails() {
        System.out.println("The type of robot is " + this.type + " and sprite image is " + this.spriteImage);
    }

    public void display(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Created- x:" + this.x);
        System.out.println("Created- y:" + this.y);
    }

}

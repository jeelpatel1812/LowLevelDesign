public class HumanoidIRobot implements IRobot {
    private String type;
    private String spriteImage;
    private double x;
    private double y;

    HumanoidIRobot(String type, String spriteImage) {
        this.type = type;
        this.spriteImage = spriteImage;
    }

    public void getDetails() {
        System.out.println("The type of robot is " + this.type + " and sprite image is " + this.spriteImage);
    }

    public void display(double x, double y) {
        this.x = x;
        this.y = y;
        System.out.println("Display");
        System.out.println("Created- x:" + this.x);
        System.out.println("Created- y:" + this.y);
    }
}

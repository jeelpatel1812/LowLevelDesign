public class DriverClass {
    public static void main(String args[]) {
        IRobot humanRobotObj = RobotFactory.createRobot("human");
        humanRobotObj.display(3, 1);
        humanRobotObj.getDetails();
        IRobot animalRobotObj = RobotFactory.createRobot("animal");
        animalRobotObj.display(2, 5);
    }
}

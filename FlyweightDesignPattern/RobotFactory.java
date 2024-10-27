import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    private static Map<String, IRobot> robotCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if (robotCache.containsKey(robotType)) {
            return robotCache.get(robotType);
        } else {
            if (robotType == "human") {
                String imgData = "Image1";
                IRobot humanoidRobotObj = new HumanoidIRobot(robotType, imgData);
                robotCache.put(robotType, humanoidRobotObj);
                return humanoidRobotObj;
            } else {
                String imgData = "Image2";
                IRobot humanoidRobotObj = new AnimalIRobot(robotType, imgData);
                robotCache.put(robotType, humanoidRobotObj);
                return humanoidRobotObj;
            }
        }
    }
}

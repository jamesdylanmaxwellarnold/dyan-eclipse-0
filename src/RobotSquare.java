
import org.jointheleague.graphical.robot.Robot;

public class RobotSquare {
	public static void main(String[] args) throws Exception {
		// 1. Make a new Robot
		Robot dave = new Robot();
		// 3. Put the robot's pen down
		dave.penDown();
		// 6. Make the robot move as fast as possible
		dave.setSpeed(10);
		// 5. Do everything below here 4 times
		for (int j = 0; j < 8; j++) {

			for (int i = 0; i < 360; i++) {

				// 2. Move your robot 200 pixels
				dave.move(1);
				// 4. Turn the robot 90 degrees to the right (90 degrees)
				dave.turn(1);

			}
			dave.turn(360 / 8);
		}
	}
}

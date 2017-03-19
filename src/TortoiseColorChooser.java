
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;
import java.awt.Color;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Colors.Blues;
import org.teachingextensions.logo.Tortoise;

public class TortoiseColorChooser {
	public static void main(String[] args) {

		// 3. ask the user what color they would like the tortoise to draw
		Tortoise.setSpeed(10);
		for (int i = 0; i < 4; i++) {

			String color = JOptionPane.showInputDialog("What color would you like the tortoise to draw.");

			// 4. use an if/else statement to set the pen color that the user
			// requested
			if (color.equals("blue")) {
				Tortoise.setPenColor(Color.BLUE);
			} else if (color.equals("orange")) {
				Tortoise.setPenColor(Color.ORANGE);
			} else if (color.equals("red")) {
				Tortoise.setPenColor(Color.red);
			} else {
				Tortoise.setPenColor(Color.BLACK);
			}

			// 5. if the user doesn’t enter anything, choose a random color

			// 6. put a loop around your code so that you keep asking the user
			// for more colors & drawing them

			// 2. set the pen width to 10
			Tortoise.setPenWidth(10);
			// 1. make the tortoise draw a shape (this will take more than one
			// line of code)
			Tortoise.penDown();

			for (int j = 0; j < 3; j++) {

				Tortoise.move(90);
				Tortoise.turn(90);
			}

			Tortoise.move(90);

		}
	}
}

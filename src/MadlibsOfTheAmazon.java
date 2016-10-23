import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's
		// how to do it...
		JOptionPane.showInputDialog(
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String epoch = JOptionPane.showInputDialog("enter an adjective");

		// Get the user to enter a type of liquid
		String H202 = JOptionPane.showInputDialog("What do you drink that you fat like a pig");
		// Get the user to enter a body part
		String thigh = JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
		String spicyboi = JOptionPane.showInputDialog("enter a verb");

		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:

		String story = "Piranhas are more " + epoch + " during the day, so cross the river at\n" +

		" night. Piranhas are attracted to fresh " + H202 + " and will most\n" +

		"likely take a bite out of your " + thigh + " if you " + spicyboi + ". Whatever \n" +

		"you do, if you have an open wound, try to find another way to get\n" + "back to the " + place + ". Good luck!";

		// Make a pop-up for the final story. You can use \n to go to the next
		// line.
		JOptionPane.showMessageDialog(null, story);
	}
}

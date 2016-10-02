
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class bithdayreminder {

	public static void main(String[] args) {

		// 1. correct the birthdays for your family below
		String momsBirthday = "August 1st";
		String dadsBirthday = "october 31st";
		String DylansBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their
		// response in a variable
		String answer = JOptionPane.showInputDialog(null, "What birthday do you want?");

		// 3. Print out what the user typed
		System.out.println(answer);
		// 4. if user asked for "mom"

		if (answer.equals("moms")) {
			// print mom's birthday
			JOptionPane.showMessageDialog(null, momsBirthday);
		}

		// 5. if user asked for "dad"
		else if (answer.equals("dads")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}

		// print dad's birthday
		// 6. if user asked for your name
		else if (answer.equals("Dylans")) {
			JOptionPane.showMessageDialog(null, DylansBirthday);

		}
		// 7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");

		}
	}
}

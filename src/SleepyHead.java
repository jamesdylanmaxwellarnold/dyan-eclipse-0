
//Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;
		isWeekday = false;
		/*
		 * Ask the user for these values using
		 * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
		 * JOptionPane.YES_NO_OPTION);
		 */
		int answer = JOptionPane.showConfirmDialog(null, "is it a weekday?");

		if (answer == 0) {
			isWeekday = true;
		} else if (answer == 1) {
			isWeekday = false;
		}

		if (isWeekday) {
			isVacation = false;
		answer=
				
			JOptionPane.showConfirmDialog(null,"is it vacation");

		if (answer == 0) {
			isVacation = true;
		} else if (answer == 1) {
			isVacation = false;
		}		
		if(!isVacation){	JOptionPane.showMessageDialog(null, "get up lazyboones");
		} else {
			JOptionPane.showMessageDialog(null, "sleep in");
		}

		/*
		 * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
		 * print “get up lazybones!” If it is a weekday, and we are on vacation,
		 * print “sleep in”.
		 */
	}
	}
}

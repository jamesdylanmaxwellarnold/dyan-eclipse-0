


// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipes".
 */
public class XG {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String Dylan="Making it rain john cenas";
	
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String answer=JOptionPane.showInputDialog("Enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
	if (answer.equals("Dylan") ) {
	JOptionPane.showMessageDialog(null, Dylan );}
	else{JOptionPane.showMessageDialog(null, "Your a thug you have no super power");
	}
	}}


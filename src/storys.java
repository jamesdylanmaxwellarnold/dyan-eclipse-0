import javax.swing.JOptionPane;

public class storys {
	public static void main(String[] args) {
		JOptionPane.showInputDialog(null, "Once apon a time there was three little camels one in somalia" + " one in china and one in china."
				+ " If the camels meet they will go to kazakstan if 2 of the camels meet it will be in the us. ");

		String answer = JOptionPane.showInputDialog("were do they go ?");
		if (answer.equals("america")) {
			JOptionPane.showMessageDialog(null, "They get a dirt bath in arkansas ");

		} else {
			JOptionPane.showMessageDialog(null, "They get sold in kazakstan for $100");
		}
	}
}
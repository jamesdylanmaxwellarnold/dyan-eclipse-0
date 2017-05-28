import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {

for (int i = 0; i < 100; i++) {
	

	String inches = JOptionPane.showInputDialog("How tall are you in inches? ");
int num = Integer.parseInt(inches);
if(num<30){JOptionPane.showMessageDialog(null, "You cannot go on the roller coaster");}
else if(num>=50){JOptionPane.showMessageDialog(null, "You can go on the ride");}	
else if(num>=30&&num<50){JOptionPane.showMessageDialog(null,"You can go on the ride but only with a parent");} 	
	
	
	
	
	
}
 }}

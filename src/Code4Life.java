




/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    Code4Life
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=Exam Readiness
 *    
 *    
 ******************************************************************************/

/** 
This recipe is similar to the coding exam.		
*/


import java.io.File;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Code4Life {
	public static void main(String[] args) {
    //JOptionPane.showInputDialog("Ho may ours did you spend coding this week");
	String num =  JOptionPane.showInputDialog("Ho may ours did you spend coding this week");
	 int number = Integer.parseInt(num);
	if (number >= 3){
		JOptionPane.showMessageDialog(null, "you are a code ninja");
	}
	else if(number < 2)  {JOptionPane.showMessageDialog(null, "shut up and get out of musky paradise that you have not left in 30 years");
		
	} 
	if(number > 5) {
		playBatmanTheme();
	}
	
	}
	
	/*
     * Ask the user how many hours they spent coding this week.
     JOption
     * 1. If it's 3 or more, tell them they're a Code Ninja.
     
     * 
     * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
     * 
     * 3. If it's more than 5, play the Batman theme song.
     */


    private static void playBatmanTheme() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(60002);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}



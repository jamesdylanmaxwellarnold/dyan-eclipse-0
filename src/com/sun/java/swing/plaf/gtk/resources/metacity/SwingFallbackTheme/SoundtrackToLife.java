package com.sun.java.swing.plaf.gtk.resources.metacity.SwingFallbackTheme;


import java.net.URI;

import javax.swing.JOptionPane;

public class SoundtrackToLife {

	public static void main(String[] args) {
 String video = "bit.ly/video-for-happy";
for (int i = 0; i < 3; i++) {
	
 // 1. Adjust this pop-up to find out what mood the user is in.
		int userMood = JOptionPane.showOptionDialog(null, "The question", "soundtrack", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Stressed", "Sad", "happy" }, null);
		
		// 2. Their answer is stored in the userMood variable. Print it out.
System.out.println(userMood);
		// 3. If they are in a stressed mood, use the playVideo method to play a calming song from YouTube.
if(userMood==0){playVideo("bit.ly/video-for-stressed");}
		// 4. Play different songs for other moods.
else if(userMood==1){playVideo("bit.ly/video-for-sad");}
else if(userMood==2){playVideo("bit.ly/video-for-happy");}}		

		// If you are seeing ads at the beginning of your videos, install Adblock.

	}

	static void playVideo(String youTubeLink) {
	/*	try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		System.out.println(youTubeLink);
	}
}




/**
* If you can’t think of any, here are some you can use...
*	bit.ly/video-for-happy
*	bit.ly/video-for-sad
*	bit.ly/video-for-angry
**/


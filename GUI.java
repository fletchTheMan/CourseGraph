/**
 * This is a class to display all of the fun things in a nice good gui.
 * @author Fletcher Hammond
 */

import javax.swing.*;
import java.awt.*;

public class GUI{
	/**
	 * main method for main method purposes.
	 * @param args bu not used for this project.
	 */
	public static void main(String[] args){
		
		JFrame jframe = new JFrame("GUI Screen");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(400,400);
		JButton button = new JButton("button for button purposes");
		JButton button2 = new JButton("other button for buttion purposes");
		JPanel panel = new JPanel();
		panel.add(button);
		panel.add(button2);
		jframe.getContentPane().add(panel);
		jframe.setVisible(true);
	}
}

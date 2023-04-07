/**
 * This is a class to display all of the fun things in a nice good gui.
 * @author Fletcher Hammond
 */

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GUI{
	/**
	 * main method for main method purposes.
	 * @param args bu not used for this project.
	 */
	public static void main(String[] args) throws FileNotFoundException {		
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
		File outfileList = new File("outfilesList.txt");
		Scanner scan = new Scanner(outfileList);
		ArrayList<String> courseAbriviations = new ArrayList<String>(100);
		while(scan.hasNextLine()){
			String line = scan.nextLine();	
			String courseAbriviation; 
			if(!line.equals("Sport, Recreation and Tourism Management George Mason University")){
				courseAbriviation = line.substring(line.indexOf("(") + 1, line.indexOf(")"));
			}
			else{
				courseAbriviation = "SRTM";
			}
			courseAbriviations.add(courseAbriviation);
		}
	}
}

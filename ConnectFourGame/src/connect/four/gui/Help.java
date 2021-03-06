package connect.four.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;


import connect.four.Game;

public class Help extends JFrame {
	JFrame helpFrame = null;
	
	public void displayHelp() {
		helpFrame = new JFrame("Connect Four Help");
		//
		
		helpFrame.setSize(600, 300);
		helpFrame.setMinimumSize(new Dimension(600,300));
		helpFrame.setMaximumSize(new Dimension(600,300));
		
		JEditorPane helpPane = new JEditorPane();
		helpPane.setContentType("html");
		
		
		helpPane.setContentType("text/plain");
		helpPane.setText(
				"The object of Connect Four is for a player to contiguously align four checkers of their color in a row. \n"
				+"\nThose four checkers may be aligned horizontally, vertically or diagonally.  However,"
				+"the other player  will be attempting to do the same thing!\n\n"
				+"Each player takes turns in dropping their checkers down one of the seven columns."
				+"  When a checker  is dropped into a column, it will settle into the lowest unoccupied space."
				+"\n\nThe game continues until one player wins by lining up four of their checkers"
				+" or a tie is forced when noplayer is able to line up four checkers before the board is filled. \n"
				+"\nStrategize carefully to prevent your opponent from winning, all while plotting your path to victory!"
				);
		
		helpPane.setEditable(false);
		helpFrame.setContentPane(helpPane);
		helpFrame.setVisible(true);
	}
		
	

}

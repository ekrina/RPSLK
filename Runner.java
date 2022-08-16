import java.awt.*;
import javax.swing.*;

/**
 * The Runner class is used to bring the Rock Paper Scissors Lizard Spock game
 * together. It's also used to initialize the JFrame, Icon, and JLabel which the
 * graphics are drawn onto.
 * 
 * @author Alexandra Long ael2203
 *
 */
public class Runner {

	/**
	 * The main method is for running the code to play a rock paper scissors game.
	 * This initializes the JFrame and Move object which has the height and width
	 * for the Icon. Then it will make an Icon and a label that takes that Icon. The
	 * frame has a border layout and the JLabel is placed in the center. A mouse
	 * listener and mouse motion listener gets added to the label to track the user
	 * mouse events.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame myFrame = new JFrame();
		Move rps = new Move(ICON_W, ICON_H);
		MyIcon myIcon = new MyIcon(rps, ICON_W, ICON_H);
		JLabel myLabel = new JLabel(myIcon);
		myFrame.setLayout(new BorderLayout());
		myFrame.add(myLabel, BorderLayout.CENTER);
		Listener move = new Listener(myLabel, rps);
		myLabel.addMouseListener(move);
		myLabel.addMouseMotionListener(move);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);

	}

	/**
	 * An int for the width of the Icon.
	 */
	private static final int ICON_W = 500;
	/**
	 * An int for the height of the Icon.
	 */
	private static final int ICON_H = 300;
}
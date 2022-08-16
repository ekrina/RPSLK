import java.awt.*;
import javax.swing.*;

/**
 * The MyIcon class implements icon and makes an Icon using a Move object.
 * 
 * @author jrk based on cay horstmann and Alexandra Long ael2203
 *
 */
public class MyIcon implements Icon {
	/**
	 * The method MyIcon takes in 3 parameters, a Move object that will be used to
	 * make a JLabel that we draw our graphics onto, the width of the Icon and
	 * height of the Icon.
	 * 
	 * @param rps The move object game
	 * @param w   The width of the Icon
	 * @param h   The height of the Icon
	 */
	public MyIcon(Move rps, int w, int h) {
		this.rps = rps;
		this.w = w;
		this.h = h;
	}

	/**
	 * The getIconWidth method returns the Icon width
	 */
	public int getIconWidth() {
		return w;
	}

	/**
	 * The getIconHeight method returns the Icon height
	 */
	public int getIconHeight() {
		return h;
	}

	/**
	 * The paintIcon method is to give the graphics to the Move objects draw method.
	 */
	public void paintIcon(Component c, Graphics g, int x, int y) {
		Graphics2D g2D = (Graphics2D) g;
		rps.draw(g2D);
	}

	private int w;
	private int h;
	private Move rps;
}

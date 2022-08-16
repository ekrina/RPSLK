import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.*;

/**
 * The class Header is used to initialize the header at the top of the frame
 * containing the drawings of the types of gestures you can choose from in the
 * game.
 * 
 * @author Alexandra Long ael2203
 *
 */
public class Header {
	/**
	 * The Header constructor takes in the width and height of the icon to use to
	 * draw the graphis.
	 * 
	 * @param width  width of the icon
	 * @param height height of the icon
	 */
	public Header(int width, int height) {
		this.w = width;
		this.h = height;
	}

	/**
	 * The draw method makes all of the shape objects for the graphics at the top of
	 * the frame in the game and returns a general path of them for the move class
	 * to draw.
	 * 
	 * @return A general path of the Shape objects
	 */
	public GeneralPath draw() {
		size = h / 12;
		difference = w / 5;
		xDiff = difference / 8;
		Ellipse2D.Double rock = new Ellipse2D.Double((xDiff * 3), size, size, size);
		Rectangle2D.Double paper = new Rectangle2D.Double((xDiff * 3) + difference * 1, size, size, size * 1.2);
		Polygon scissors = new Polygon();
		scissors.addPoint(xDiff * 3 + difference * 2, size);
		scissors.addPoint(xDiff * 5 + difference * 2, size);
		scissors.addPoint(xDiff * 4 + difference * 2, size + size / 2);
		scissors.addPoint(xDiff * 3 + difference * 2, size);
		scissors.addPoint(xDiff * 4 + difference * 2, size);
		scissors.addPoint(xDiff * 4 + difference * 2, size + size / 2);
		scissors.addPoint(xDiff * 3 + difference * 2, size * 2);
		scissors.addPoint(xDiff * 4 + difference * 2, size + size / 2);
		scissors.addPoint(xDiff * 5 + difference * 2, size * 2);
		Polygon spock = new Polygon();
		spock.addPoint(xDiff * 3 + difference * 4, size);
		spock.addPoint((xDiff * 3 + difference * 4) + 10, size - 8);
		spock.addPoint((xDiff * 3 + difference * 4) + 12, size + 2);
		spock.addPoint((xDiff * 3 + difference * 4) + 12, size + 20);
		spock.addPoint((xDiff * 3 + difference * 4) + 5, size + 9);
		spock.addPoint((xDiff * 3 + difference * 4) - 8, size + 30);
		Polygon lizard = new Polygon();
		lizard.addPoint((xDiff * 3 + difference * 3) + 1, size + 14);
		lizard.addPoint((xDiff * 3 + difference * 3) - 3, size + 12);
		lizard.addPoint((xDiff * 3 + difference * 3) - 3, size + 8);
		lizard.addPoint((xDiff * 3 + difference * 3), size);
		lizard.addPoint((xDiff * 3 + difference * 3) + 2, size);
		lizard.addPoint((xDiff * 3 + difference * 3) + 6, size + 6);
		lizard.addPoint((xDiff * 3 + difference * 3) + 7, size + 8);
		lizard.addPoint((xDiff * 3 + difference * 3) + 6, size + 12);
		lizard.addPoint((xDiff * 3 + difference * 3) + 7, size + 14);
		lizard.addPoint((xDiff * 3 + difference * 3) + 11, size + 15);
		lizard.addPoint((xDiff * 3 + difference * 3) + 12, size + 11);
		lizard.addPoint((xDiff * 3 + difference * 3) + 11, size + 10);
		lizard.addPoint((xDiff * 3 + difference * 3) + 12, size + 9);
		lizard.addPoint((xDiff * 3 + difference * 3) + 13, size + 10);
		lizard.addPoint((xDiff * 3 + difference * 3) + 13, size + 11);
		lizard.addPoint((xDiff * 3 + difference * 3) + 14, size + 11);
		lizard.addPoint((xDiff * 3 + difference * 3) + 14, size + 10);
		lizard.addPoint((xDiff * 3 + difference * 3) + 15, size + 9);
		lizard.addPoint((xDiff * 3 + difference * 3) + 16, size + 10);
		lizard.addPoint((xDiff * 3 + difference * 3) + 15, size + 11);
		lizard.addPoint((xDiff * 3 + difference * 3) + 16, size + 11);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 12);
		lizard.addPoint((xDiff * 3 + difference * 3) + 16, size + 13);
		lizard.addPoint((xDiff * 3 + difference * 3) + 15, size + 12);
		lizard.addPoint((xDiff * 3 + difference * 3) + 11, size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3) + 8, size + 15);
		lizard.addPoint((xDiff * 3 + difference * 3) + 10, size + 25);
		lizard.addPoint((xDiff * 3 + difference * 3) + 22, size + 50);
		lizard.addPoint((xDiff * 3 + difference * 3) + 22, size + 48);
		lizard.addPoint((xDiff * 3 + difference * 3) + 25, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 30, size + 42);
		lizard.addPoint((xDiff * 3 + difference * 3) + 28, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 29, size + 39);
		lizard.addPoint((xDiff * 3 + difference * 3) + 30, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 30, size + 41);
		lizard.addPoint((xDiff * 3 + difference * 3) + 31, size + 41);
		lizard.addPoint((xDiff * 3 + difference * 3) + 31, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 32, size + 39);
		lizard.addPoint((xDiff * 3 + difference * 3) + 33, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 33, size + 41);
		lizard.addPoint((xDiff * 3 + difference * 3) + 34, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 35, size + 40);
		lizard.addPoint((xDiff * 3 + difference * 3) + 34, size + 41);
		lizard.addPoint((xDiff * 3 + difference * 3) + 29, size + 43);
		lizard.addPoint((xDiff * 3 + difference * 3) + 28, size + 41);
		lizard.addPoint((xDiff * 3 + difference * 3) + 28, size + 54);
		lizard.addPoint((xDiff * 3 + difference * 3) + 34, size + 56);
		lizard.addPoint((xDiff * 3 + difference * 3) + 40, size + 55);
		lizard.addPoint((xDiff * 3 + difference * 3) + 44, size + 56);
		lizard.addPoint((xDiff * 3 + difference * 3) + 46, size + 60);
		lizard.addPoint((xDiff * 3 + difference * 3) + 46, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 44, size + 67);
		lizard.addPoint((xDiff * 3 + difference * 3) + 41, size + 68);
		lizard.addPoint((xDiff * 3 + difference * 3) + 38, size + 68);
		lizard.addPoint((xDiff * 3 + difference * 3) + 43, size + 65);
		lizard.addPoint((xDiff * 3 + difference * 3) + 45, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 44, size + 58);
		lizard.addPoint((xDiff * 3 + difference * 3) + 42, size + 57);
		lizard.addPoint((xDiff * 3 + difference * 3) + 34, size + 58);
		lizard.addPoint((xDiff * 3 + difference * 3) + 25, size + 57);
		lizard.addPoint((xDiff * 3 + difference * 3) + 19, size + 58);
		lizard.addPoint((xDiff * 3 + difference * 3) + 22, size + 61);
		lizard.addPoint((xDiff * 3 + difference * 3) + 22, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 23, size + 65);
		lizard.addPoint((xDiff * 3 + difference * 3) + 22, size + 66);
		lizard.addPoint((xDiff * 3 + difference * 3) + 21, size + 65);
		lizard.addPoint((xDiff * 3 + difference * 3) + 19, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 18, size + 64);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 65);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 64);
		lizard.addPoint((xDiff * 3 + difference * 3) + 18, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 63);
		lizard.addPoint((xDiff * 3 + difference * 3) + 16, size + 62);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 61);
		lizard.addPoint((xDiff * 3 + difference * 3) + 19, size + 61);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 58);
		lizard.addPoint((xDiff * 3 + difference * 3) + 17, size + 55);
		lizard.addPoint((xDiff * 3 + difference * 3) + 19, size + 56);
		lizard.addPoint((xDiff * 3 + difference * 3) + 13, size + 52);
		lizard.addPoint((xDiff * 3 + difference * 3) + 6, size + 46);
		lizard.addPoint((xDiff * 3 + difference * 3), size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3) - 3, size + 19);
		lizard.addPoint((xDiff * 3 + difference * 3) - 7, size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3) - 8, size + 18);
		lizard.addPoint((xDiff * 3 + difference * 3) - 9, size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3) - 8, size + 16);
		lizard.addPoint((xDiff * 3 + difference * 3) - 7, size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3) - 8, size + 15);
		lizard.addPoint((xDiff * 3 + difference * 3) - 8, size + 14);
		lizard.addPoint((xDiff * 3 + difference * 3) - 7, size + 14);
		lizard.addPoint((xDiff * 3 + difference * 3) - 7, size + 16);
		lizard.addPoint((xDiff * 3 + difference * 3) - 7, size + 15);
		lizard.addPoint((xDiff * 3 + difference * 3) - 6, size + 15);
		lizard.addPoint((xDiff * 3 + difference * 3) - 6, size + 16);
		lizard.addPoint((xDiff * 3 + difference * 3) - 3, size + 17);
		lizard.addPoint((xDiff * 3 + difference * 3), size + 15);
		GeneralPath path = new GeneralPath();
		path.append(rock, false);
		path.append(paper, false);
		path.append(scissors, false);
		path.append(spock, false);
		path.append(lizard, false);
		return path;
	}

	private int w;
	private int h;
	private int size;
	private int xDiff;
	private int difference;
}

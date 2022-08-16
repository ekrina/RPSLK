import java.awt.*;
import java.awt.geom.*;

/**
 * The GraphicMove class has all of the shape object specifications to be drawn
 * and added to the gestures arraylist in the class Move.
 * 
 * @author Alexandra Long ael2203
 *
 */
public class GraphicMove {
	/**
	 * The getRock method takes in the x and y position that the users mouse pressed
	 * to make an ellipse for a rock gesture.
	 * 
	 * @param x X position of mouse.
	 * @param y Y position of mouse.
	 * @return A shape object of the specified gesture.
	 */
	public Shape getRock(double x, double y) {
		Ellipse2D.Double rock = new Ellipse2D.Double(x, y, size, size);
		return rock;
	}

	/**
	 * The getPaper method takes in the x and y position that the users mouse
	 * pressed to make a rectangle for a paper gesture.
	 * 
	 * @param x X position of mouse.
	 * @param y Y position of mouse.
	 * @return A shape object of the specified gesture.
	 */
	public Shape getPaper(double x, double y) {
		Rectangle2D.Double paper = new Rectangle2D.Double(x, y, size, size * 1.2);
		return paper;
	}

	/**
	 * The getScissors method takes in the x and y position that the users mouse
	 * pressed to make a polygon for a scissors gesture.
	 * 
	 * @param x X position of mouse.
	 * @param y Y position of mouse.
	 * @return A shape object of the specified gesture.
	 */
	public Shape getScissors(double x, double y) {
		Polygon scissors = new Polygon();
		scissors.addPoint((int) (int) x, (int) (int) y + size);
		scissors.addPoint((int) x + (int) xDiff, (int) y + size / 2);
		scissors.addPoint((int) x + (int) xDiff * 2, (int) y + size);
		scissors.addPoint((int) x, (int) y);
		scissors.addPoint((int) x + (int) xDiff * 2, (int) y);
		scissors.addPoint((int) x + (int) xDiff, (int) y + size / 2);
		scissors.addPoint((int) x + (int) xDiff, (int) y);
		scissors.addPoint((int) x + (int) xDiff, (int) y + size / 2);
		scissors.addPoint((int) x, (int) y + size);
		return scissors;
	}

	/**
	 * The getLizard method takes in the x and y position that the users mouse
	 * pressed to make a polygon for a lizard gesture.
	 * 
	 * @param x X position of mouse.
	 * @param y Y position of mouse.
	 * @return A shape object of the specified gesture.
	 */
	public Shape getLizard(double x, double y) {
		Polygon lizard = new Polygon();
		lizard.addPoint((int) x + 1, (int) y + 14);
		lizard.addPoint((int) x - 3, (int) y + 12);
		lizard.addPoint((int) x - 3, (int) y + 8);
		lizard.addPoint((int) x, (int) y);
		lizard.addPoint((int) x + 2, (int) y);
		lizard.addPoint((int) x + 6, (int) y + 6);
		lizard.addPoint((int) x + 7, (int) y + 8);
		lizard.addPoint((int) x + 6, (int) y + 12);
		lizard.addPoint((int) x + 7, (int) y + 14);
		lizard.addPoint((int) x + 11, (int) y + 15);
		lizard.addPoint((int) x + 12, (int) y + 11);
		lizard.addPoint((int) x + 11, (int) y + 10);
		lizard.addPoint((int) x + 12, (int) y + 9);
		lizard.addPoint((int) x + 13, (int) y + 10);
		lizard.addPoint((int) x + 13, (int) y + 11);
		lizard.addPoint((int) x + 14, (int) y + 11);
		lizard.addPoint((int) x + 14, (int) y + 10);
		lizard.addPoint((int) x + 15, (int) y + 9);
		lizard.addPoint((int) x + 16, (int) y + 10);
		lizard.addPoint((int) x + 15, (int) y + 11);
		lizard.addPoint((int) x + 16, (int) y + 11);
		lizard.addPoint((int) x + 17, (int) y + 12);
		lizard.addPoint((int) x + 16, (int) y + 13);
		lizard.addPoint((int) x + 15, (int) y + 12);
		lizard.addPoint((int) x + 11, (int) y + 17);
		lizard.addPoint((int) x + 8, (int) y + 15);
		lizard.addPoint((int) x + 10, (int) y + 25);
		lizard.addPoint((int) x + 22, (int) y + 50);
		lizard.addPoint((int) x + 22, (int) y + 48);
		lizard.addPoint((int) x + 25, (int) y + 40);
		lizard.addPoint((int) x + 30, (int) y + 42);
		lizard.addPoint((int) x + 28, (int) y + 40);
		lizard.addPoint((int) x + 29, (int) y + 39);
		lizard.addPoint((int) x + 30, (int) y + 40);
		lizard.addPoint((int) x + 30, (int) y + 41);
		lizard.addPoint((int) x + 31, (int) y + 41);
		lizard.addPoint((int) x + 31, (int) y + 40);
		lizard.addPoint((int) x + 32, (int) y + 39);
		lizard.addPoint((int) x + 33, (int) y + 40);
		lizard.addPoint((int) x + 33, (int) y + 41);
		lizard.addPoint((int) x + 34, (int) y + 40);
		lizard.addPoint((int) x + 35, (int) y + 40);
		lizard.addPoint((int) x + 34, (int) y + 41);
		lizard.addPoint((int) x + 29, (int) y + 43);
		lizard.addPoint((int) x + 28, (int) y + 41);
		lizard.addPoint((int) x + 28, (int) y + 54);
		lizard.addPoint((int) x + 34, (int) y + 56);
		lizard.addPoint((int) x + 40, (int) y + 55);
		lizard.addPoint((int) x + 44, (int) y + 56);
		lizard.addPoint((int) x + 46, (int) y + 60);
		lizard.addPoint((int) x + 46, (int) y + 63);
		lizard.addPoint((int) x + 44, (int) y + 67);
		lizard.addPoint((int) x + 41, (int) y + 68);
		lizard.addPoint((int) x + 38, (int) y + 68);
		lizard.addPoint((int) x + 43, (int) y + 65);
		lizard.addPoint((int) x + 45, (int) y + 63);
		lizard.addPoint((int) x + 44, (int) y + 58);
		lizard.addPoint((int) x + 42, (int) y + 57);
		lizard.addPoint((int) x + 34, (int) y + 58);
		lizard.addPoint((int) x + 25, (int) y + 57);
		lizard.addPoint((int) x + 19, (int) y + 58);
		lizard.addPoint((int) x + 22, (int) y + 61);
		lizard.addPoint((int) x + 22, (int) y + 63);
		lizard.addPoint((int) x + 23, (int) y + 65);
		lizard.addPoint((int) x + 22, (int) y + 66);
		lizard.addPoint((int) x + 21, (int) y + 65);
		lizard.addPoint((int) x + 19, (int) y + 63);
		lizard.addPoint((int) x + 18, (int) y + 64);
		lizard.addPoint((int) x + 17, (int) y + 65);
		lizard.addPoint((int) x + 17, (int) y + 64);
		lizard.addPoint((int) x + 18, (int) y + 63);
		lizard.addPoint((int) x + 17, (int) y + 63);
		lizard.addPoint((int) x + 16, (int) y + 62);
		lizard.addPoint((int) x + 17, (int) y + 61);
		lizard.addPoint((int) x + 19, (int) y + 61);
		lizard.addPoint((int) x + 17, (int) y + 58);
		lizard.addPoint((int) x + 17, (int) y + 55);
		lizard.addPoint((int) x + 19, (int) y + 56);
		lizard.addPoint((int) x + 13, (int) y + 52);
		lizard.addPoint((int) x + 6, (int) y + 46);
		lizard.addPoint((int) x, (int) y + 17);
		lizard.addPoint((int) x - 3, (int) y + 19);
		lizard.addPoint((int) x - 7, (int) y + 17);
		lizard.addPoint((int) x - 8, (int) y + 18);
		lizard.addPoint((int) x - 9, (int) y + 17);
		lizard.addPoint((int) x - 8, (int) y + 16);
		lizard.addPoint((int) x - 7, (int) y + 17);
		lizard.addPoint((int) x - 8, (int) y + 15);
		lizard.addPoint((int) x - 8, (int) y + 14);
		lizard.addPoint((int) x - 7, (int) y + 14);
		lizard.addPoint((int) x - 7, (int) y + 16);
		lizard.addPoint((int) x - 7, (int) y + 15);
		lizard.addPoint((int) x - 6, (int) y + 15);
		lizard.addPoint((int) x - 6, (int) y + 16);
		lizard.addPoint((int) x - 3, (int) y + 17);
		lizard.addPoint((int) x, (int) y + 15);
		return lizard;
	}

	/**
	 * The getSpock method takes in the x and y position that the users mouse
	 * pressed to make a polygon for a spock gesture.
	 * 
	 * @param x X position of mouse.
	 * @param y Y position of mouse.
	 * @return A shape object of the specified gesture.
	 */
	public Shape getSpock(double x, double y) {
		Polygon spock = new Polygon();
		spock.addPoint((int) x, (int) y + 30);
		spock.addPoint((int) x + 8, (int) y + 8);
		spock.addPoint((int) x + 18, (int) y);
		spock.addPoint((int) x + 20, (int) y + 10);
		spock.addPoint((int) x + 20, (int) y + 28);
		spock.addPoint((int) x + 12, (int) y + 15);
		spock.addPoint((int) x, (int) y + 30);
		return spock;
	}

	/**
	 * All integers that correspond to the icon width and height to make these shape
	 * objects.
	 */
	private int size = 25;
	private int difference = 100;
	private int xDiff = difference / 8;
}

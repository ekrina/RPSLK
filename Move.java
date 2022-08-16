import java.awt.*;
import java.util.*;
import java.awt.geom.*;

/**
 * The class Move is to make our Icon and eventually JLabel that holds all the
 * graphics of the RPSKL game.
 * 
 * When pressing on the Lizard and Spock polygons, you need to press of the top
 * right hand of the lizard and the left edge of spock symbol.
 * 
 * @author Alexandra Long ael2203
 *
 */
public class Move {
	/**
	 * The Move constructor takes in a integer for the height and width of the Icon.
	 * This is for passing through to our header class that makes the first strip of
	 * graphics to choose RPSKL gestures from. The constructor also initializes two
	 * arraylists. One is an arraylist of arrays of doubles(used for putting the
	 * necessary inputs for drawings) and the other is an arraylist of shapes(for
	 * checking whether objects collide/if a point is contained in them).
	 * 
	 * @param width  Integer of the width of the Icon
	 * @param height Integer of the height of the Icon
	 */
	public Move(int width, int height) {
		this.height = height;
		this.width = width;
		this.arrays = new ArrayList<double[]>();
		this.gestures = new ArrayList<Shape>();
	}

	/**
	 * The draw method is used for drawing all of the gestures onto the Icon when
	 * playing the game. This method first initializes the header object to make the
	 * strip of graphics you can press to get a specific gesture. For example, if
	 * you press on the rock, a rock will be drawn and you can drag it to the
	 * "arena" (lower on the frame). Then a for loop iterates through the arraylist
	 * of doubles to draw the graphics of each object that is supposed to be on the
	 * screen.
	 * 
	 * @param g2d Graphics2D
	 */
	public void draw(Graphics2D g2d) {
		Header header = new Header(width, height);
		GeneralPath horizontal = header.draw();
		g2d.draw(horizontal);
		GraphicMove graphics = new GraphicMove();
		for (double[] array : arrays) {
			if (array[4] == 0) {
				Shape rock = graphics.getRock(array[0], array[1]);
				g2d.setPaint(new Color(153, 153, 153));
				g2d.fill(rock);
				g2d.draw(rock);
			} else if (array[4] == 1) {
				Shape paper = graphics.getPaper(array[0], array[1]);
				g2d.setPaint(new Color(255, 255, 255));
				g2d.fill(paper);
				g2d.draw(paper);
			} else if (array[4] == 2) {
				Shape scissors = graphics.getScissors(array[0], array[1]);
				g2d.setPaint(new Color(192, 192, 192));
				g2d.draw(scissors);
			} else if (array[4] == 3) {
				Shape lizard = graphics.getLizard(array[0], array[1]);
				g2d.setPaint(new Color(0, 153, 0));
				g2d.fill(lizard);
				g2d.draw(lizard);
			} else if (array[4] == 4) {
				Shape spock = graphics.getSpock(array[0], array[1]);
				g2d.setPaint(new Color(255, 204, 51));
				g2d.fill(spock);
				g2d.draw(spock);
			}
		}
	}

	/**
	 * The method makeMove is used by the listener class to create a drawing of the
	 * specific gesture pressed on the screen. This method calls on methods from the
	 * GraphicMove class to obtain the Shape object to add to the gesture arraylist
	 * and calls on methods from the ShapeArray class to obtain the double[] to add
	 * to the other arraylist.
	 * 
	 * @param p    The point the was clicked on by the user's mouse.
	 * @param move The number for the move that the user chose determined by
	 *             location of mouse click.
	 */
	public void makeMove(Point p, int move) {
		GraphicMove visual = new GraphicMove();
		ShapeArray array = new ShapeArray();
		if (move == 0) {
			gestures.add(visual.getRock(p.getX(), p.getY()));
			arrays.add(array.getRockArray(p));
		} else if (move == 1) {
			gestures.add(visual.getPaper(p.getX(), p.getY()));
			arrays.add(array.getPaperArray(p));
		} else if (move == 2) {
			gestures.add(visual.getScissors(p.getX(), p.getY()));
			arrays.add(array.getScissorArray(p));
		} else if (move == 3) {
			gestures.add(visual.getLizard(p.getX(), p.getY()));
			arrays.add(array.getLizardArray(p));
		} else if (move == 4) {
			gestures.add(visual.getSpock(p.getX(), p.getY()));
			arrays.add(array.getSpockArray(p));
		}
	}

	/**
	 * The method translate moves the obects around on the screen when the user's
	 * mouse is dragging them. It does this by getting the difference on the x-axis
	 * and y-axis to change the values at double[] 0 and 1 location depending on
	 * updated x and y positions. It also takes in which number shape it is in the
	 * array so that the array can drag the right shape on the screen. It also
	 * removes that shape from the array and adds back in the update version. It
	 * also does this to the gestures array by calling the updated version to add
	 * from GraphicMove.
	 * 
	 * @param xChange   Difference in x-position
	 * @param yChange   Difference in y-position
	 * @param thisShape The index of the shape in the arrays arraylist
	 */
	public void translate(double xChange, double yChange, int thisShape) {
		double[] shape = arrays.get(thisShape);
		arrays.remove(thisShape);
		gestures.remove(thisShape);
		GraphicMove translateGest = new GraphicMove();
		shape[0] += xChange;
		shape[1] += yChange;
		if (shape[4] == 0) {
			gestures.add(thisShape, translateGest.getRock(shape[0], shape[1]));
		} else if (shape[4] == 1) {
			gestures.add(thisShape, translateGest.getPaper(shape[0], shape[1]));
		} else if (shape[4] == 3) {
			gestures.add(thisShape, translateGest.getLizard(shape[0], shape[1]));
		} else if (shape[4] == 2) {
			gestures.add(thisShape, translateGest.getScissors(shape[0], shape[1]));
		} else if (shape[4] == 4) {
			gestures.add(thisShape, translateGest.getSpock(shape[0], shape[1]));
		}
		arrays.add(thisShape, shape);

	}

	/**
	 * The method getType takes in the index of the shape from the array and returns
	 * the kind of gesture it is, (ie. Rock, Scissors, etc.)
	 * 
	 * @param thisShape Index of shape from array
	 * @return The number indicating what kind of gesture the indexed shape is.
	 */
	public int getType(int thisShape) {
		double[] array = arrays.get(thisShape);
		return (int) array[4];
	}

	/**
	 * The has method takes in a point and returns the number of the gesture if that
	 * gesture contains the point being pressed on by the user. It does this by
	 * iterating through the gestures arraylist to see if any of the Shape objects
	 * contain the point.
	 * 
	 * @param p The point being pressed on by the user.
	 * @return The number of the shape being pressed or -1 if no shape is being
	 *         pressed.
	 */
	public int has(Point p) {
		int count = 0;
		for (Shape gesture : gestures) {
			if (gesture.contains(p)) {
				return count;
			}
			count += 1;
		}
		return -1;
	}

	/**
	 * The method collide takes in an index for the shape being dragged and checks
	 * if it collides with any other shape by using the intersection method.
	 * 
	 * @param thisShape The index for the shape being dragged.
	 * @return The index for the shape that is being collided with or -1 if no shape
	 *         is collided into.
	 */
	public int collide(int thisShape) {
		int count = 0;
		Rectangle2D shapeOne = gestures.get(thisShape).getBounds2D();
		for (Shape gesture : gestures) {
			if (count != thisShape && gesture.intersects(shapeOne)) {
				return count;
			}
			count += 1;
		}
		return -1;
	}

	/**
	 * The method lost takes in the index for the shape that lost the game and
	 * removes it from the array so that it disappears from the drawings
	 * 
	 * @param thisShape
	 */
	public void lost(int thisShape) {
		arrays.remove(thisShape);
		gestures.remove(thisShape);
	}

	/**
	 * Integer width of the icon.
	 */
	private int width;
	/**
	 * Integer height of the icon.
	 */
	private int height;
	/**
	 * Arraylist of double[] that hold the numbers to draw the Shape objects.
	 */
	private ArrayList<double[]> arrays;
	/**
	 * Arraylist of Shape objects.
	 */
	private ArrayList<Shape> gestures;
}

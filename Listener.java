import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.event.MouseInputListener;

/**
 * The listener class implements MouseInputListener to inherit the methods for
 * checking whether a user is clicking pressing or dragging the mouse.
 * 
 * @author Alexandra Long
 *
 */
public class Listener implements MouseInputListener {
	/**
	 * The constructor takes in a JLabel and Move object so that it can repaint the
	 * label when the graphics have changed.
	 * 
	 * @param myLabel JLabel from the runner.
	 * @param rps     Move object that the graphics are on.
	 */
	public Listener(JLabel myLabel, Move rps) {
		this.label = myLabel;
		this.game = rps;
	}

	/**
	 * The method mouseClicked is used to find where the user clicked on the screen.
	 * If they clicked in the horizontal region at the top, the method will call on
	 * the Move class to make the graphic that corresponds to what the user clicked
	 * on.
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		drawHere = e.getPoint();
		if (drawHere.getX() <= 100 && drawHere.getY() <= 100) {
			game.makeMove(drawHere, 0);
		} else if (drawHere.getX() <= 200 && drawHere.getY() <= 100) {
			game.makeMove(drawHere, 1);
		} else if (drawHere.getX() <= 300 && drawHere.getY() <= 100) {
			game.makeMove(drawHere, 2);
		} else if (drawHere.getX() <= 400 && drawHere.getY() <= 100) {
			game.makeMove(drawHere, 4);
		} else if (drawHere.getX() <= 500 && drawHere.getY() <= 100) {
			game.makeMove(drawHere, 3);
		}
		label.repaint();
	}

	/**
	 * The mousePressed method checks if the location pressed on by the user
	 * corresponds to any objects drawn. If it does then it gets which object and
	 * the mouseDragged method moves it. If it doesn't then mousePoint is changed to
	 * null.
	 */
	@Override
	public void mousePressed(MouseEvent e) {
		mousePoint = e.getPoint();
		if (game.has(mousePoint) == -1) {
			mousePoint = null;
		} else {
			thisShape = game.has(mousePoint);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * The mouseDragged method is to get the location of where the mouse is being
	 * dragged and move the object accordingly. It also checks if the object
	 * collides with any other object by calling the method collide from the Move
	 * class. If it does collide with another object then it initializes a winner
	 * object and uses the method won to check who has won the altercation. It then
	 * calls the lost method from move and gets rid of the shape that lost.
	 */
	@Override
	public void mouseDragged(MouseEvent e) {
		if (thisShape != -1 && mousePoint != null) {
			lastMP = mousePoint;
			mousePoint = e.getPoint();
			double dx = mousePoint.getX() - lastMP.getX();
			double dy = mousePoint.getY() - lastMP.getY();
			game.translate(dx, dy, thisShape);
			label.repaint();
			if (game.collide(thisShape) != -1) {
				collisionShape = game.collide(thisShape);
				shapeOfOne = game.getType(thisShape);
				shapeOfTwo = game.getType(collisionShape);
				Winner winner = new Winner();
				int whoWon = winner.won(shapeOfOne, shapeOfTwo);
				if (whoWon == -1) {
					game.lost(collisionShape);
					mousePoint = null;
				} else if (whoWon == 1) {
					game.lost(thisShape);
					mousePoint = null;
				} else {

				}
			}
		}

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * The index corresponding to the shape.
	 */
	private int thisShape;
	/**
	 * The Jlabel from the runner
	 */
	private JLabel label;
	/**
	 * The Move Object
	 */
	private Move game;
	/**
	 * Point for where the user clicked.
	 */
	private Point drawHere;
	/**
	 * Point where the users mouse pressed
	 */
	private Point mousePoint;
	/**
	 * Point where the users mouse pressed last
	 */
	private Point lastMP;
	/**
	 * Type of shape being collided with
	 */
	private int collisionShape;
	/**
	 * Integer of shape that user is dragging.
	 */
	private int shapeOfOne;
	/**
	 * Integer of shape being dragged into.
	 */
	private int shapeOfTwo;
}

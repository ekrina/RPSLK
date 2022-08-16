import java.awt.*;

/**
 * The ShapeArray class returns a double[] that the Move class adds to its
 * arraylist of double[].
 * 
 * @author Alexandra Long ael2203
 *
 */
public class ShapeArray {

	/**
	 * The getRockArray method gets the double[] for the specified gesture based on
	 * the point pressed.
	 * 
	 * @param p Point pressed that will determine where the shape is drawn.
	 * @return The double[]
	 */
	public double[] getRockArray(Point p) {
		shape[0] = p.getX();
		shape[1] = p.getY();
		shape[2] = size;
		shape[3] = size;
		shape[4] = 0;
		return shape;
	}

	/**
	 * The getPaperArray method gets the double[] for the specified gesture based on
	 * the point pressed.
	 * 
	 * @param p Point pressed that will determine where the shape is drawn.
	 * @return The double[]
	 */
	public double[] getPaperArray(Point p) {
		shape[0] = p.getX();
		shape[1] = p.getY();
		shape[2] = size;
		shape[3] = size * 1.2;
		shape[4] = 1;
		return shape;
	}

	/**
	 * The getScissorArray method gets the double[] for the specified gesture based
	 * on the point pressed.
	 * 
	 * @param p Point pressed that will determine where the shape is drawn.
	 * @return The double[]
	 */
	public double[] getScissorArray(Point p) {
		shape[0] = p.getX();
		shape[1] = p.getY();
		shape[2] = 0;
		shape[3] = 0;
		shape[4] = 2;
		return shape;
	}

	/**
	 * The getSpockArray method gets the double[] for the specified gesture based on
	 * the point pressed.
	 * 
	 * @param p Point pressed that will determine where the shape is drawn.
	 * @return The double[]
	 */
	public double[] getSpockArray(Point p) {
		shape[0] = p.getX();
		shape[1] = p.getY();
		shape[2] = size;
		shape[3] = size;
		shape[4] = 3;
		return shape;
	}

	/**
	 * The getLizardArray method gets the double[] for the specified gesture based
	 * on the point pressed.
	 * 
	 * @param p Point pressed that will determine where the shape is drawn.
	 * @return The double[]
	 */
	public double[] getLizardArray(Point p) {
		shape[0] = p.getX();
		shape[1] = p.getY();
		shape[2] = size;
		shape[3] = size;
		shape[4] = 4;
		return shape;
	}

	/**
	 * A double that is initialized to 5 spaces for each value needed in the
	 * double[]
	 */
	private double[] shape = new double[5];
	private int size = 25;
}

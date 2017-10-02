/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39397876
 *
 */
public abstract class Triangle extends FigureImpl {

	protected double base;
	protected double height;
	protected double side1;
	protected double side2;
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double side1, double side2, double height) {
		this.base = base;
		this.side1 = side1;
		this.side2 = side2;
		this.height = height;
	}

	/* (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		return this.base * this.height / 2;
	}

}

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
	
	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
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

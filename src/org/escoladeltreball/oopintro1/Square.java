/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39397876
 *
 */
public class Square extends FigureImpl {

	private double base;
	
	/**
	 * @param base
	 */
	public Square(double base) {
		this.base = base;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.base * 4;
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#area()
	 */
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.base * this.base;
	}

}

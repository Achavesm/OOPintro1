/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39397876
 *
 */
public class Isosceles extends Triangle {

	
	/**
	 * @param base
	 * @param side1
	 * @param side2
	 * @param height
	 */
	public Isosceles(double base, double side, double height) {
		super(base, side, side, height);
		// TODO Auto-generated constructor stub
	}


	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return super.base + super.side1 * 2;
	}


}

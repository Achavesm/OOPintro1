/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39397876
 *
 */
public class Equilater extends Triangle {

	/**
	 * @param base
	 * @param height
	 */


	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return super.base * 3;
	}

	/**
	 * @param base
	 * @param side1
	 * @param side2
	 * @param height
	 */
	public Equilater(double base, double height) {
		super(base, base, base, height);
		// TODO Auto-generated constructor stub
	}

}

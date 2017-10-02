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
	public Equilater(double base, double height) {
		super(base, height);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return super.base * 3;
	}

}

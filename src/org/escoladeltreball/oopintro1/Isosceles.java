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
	 * @param height
	 */
	public Isosceles(double base, double height) {
		super(base, height);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return 3 * super.height + super.base;
	}

}

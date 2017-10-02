/**
 * 
 */
package org.escoladeltreball.oopintro1;

/**
 * @author iaw39397876
 *
 */
public class Escale extends Triangle {

	/**
	 * @param base
	 * @param side1
	 * @param side2
	 * @param height
	 */
	public Escale(double base, double side1, double side2, double height) {
		super(base, side1, side2, height);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.oopintro1.Figure#perimeter()
	 */
	@Override
	public double perimeter() {
		return super.base + super.side1 + super.side2;
	}



}

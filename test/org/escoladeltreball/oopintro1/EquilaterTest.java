/**
 * 
 */
package org.escoladeltreball.oopintro1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author iaw39397876
 *
 */
public class EquilaterTest {

	Equilater equilater;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		equilater = new Equilater(6,12);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		equilater = null;
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Equilater#perimeter()}.
	 */
	@Test
	public final void testPerimeter() {
		assertEquals(18, equilater.perimeter(), 1.0e-4);
	}

	/**
	 * Test method for {@link org.escoladeltreball.oopintro1.Triangle#area()}.
	 */
	@Test
	public final void testArea() {
		assertEquals(36.0, equilater.area(), 1.0e-4);
	}

}

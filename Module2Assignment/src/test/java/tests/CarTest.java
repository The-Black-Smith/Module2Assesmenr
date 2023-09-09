/**
 * @author Alec Smith - ajsmith44 
 * CIS175 Fall 2023
 * Sep 8, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import model.Car;

/**
 * 
 */
public class CarTest {
	Car car1 = new Car("Chevrolet", 2013, 60000, 465);

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertEquals(2013, car1.getYear());
		assertEquals(60000, car1.getPrice());
	}

}

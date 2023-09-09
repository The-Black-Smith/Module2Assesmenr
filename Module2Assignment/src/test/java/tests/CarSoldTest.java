/**
 * @author Alec Smith - ajsmith44 
 * CIS175 Fall 2023
 * Sep 8, 2023
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Car;
/**
 * 
 */
public class CarSoldTest {
	Car boughtCar = new Car("Ford", 2023, 85630, 3579);
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		boughtCar.sellCar();
	}

	@Test
	public void test() {
		assertNotNull(boughtCar.getBrand());
		assertEquals(0,boughtCar.getLotNumber());
		assertTrue(boughtCar.getSold());
	}

}

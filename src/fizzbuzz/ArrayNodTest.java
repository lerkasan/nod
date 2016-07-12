package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayNodTest {

	@Test
	public void generalTest() {
		Integer[] numbers = { 90, 30, 15, 45, 60, 15, 300, 600, 900 };
		assertEquals(15, Main.arrayNod(numbers));
		Integer[] numbers2 = { 90, 30, 15, 45, 60, 15, 300, 600, 900, 8 };
		assertEquals(1, Main.arrayNod(numbers2));
	}
	
	@Test
	public void negativeNumberTest() {
		Integer[] numbers = { -90, 30, -15, 45, 60, 15, -300, 600, 900 };
		assertEquals(15, Main.arrayNod(numbers));
		Integer[] numbers2 = { 90, -30, 15, 45, 60, -15, 300, 600, -900, 8 };
		assertEquals(1, Main.arrayNod(numbers2));
	}
	
	@Test
	public void zeroNumberTest() {
		Integer[] numbers = { 0, -90, 30, -15, 45, 60, 15, -300, 600, 900, 0 };
		assertEquals(15, Main.arrayNod(numbers));
		Integer[] numbers2 = { 0,0,0,0,0 };
		assertEquals(Integer.MAX_VALUE, Main.arrayNod(numbers2));
	}

}

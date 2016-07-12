package fizzbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairNodTest {
	
	@Test
	public void generalNodTest() {
		assertEquals(6,Main.nod(4566,1368));
		assertEquals(5,Main.nod(90,35));
	}
	
	@Test
	public void negativeNumberNodTest() {
		assertEquals(6,Main.nod(-4566,1368));
		assertEquals(5,Main.nod(90,-35));
	}
	
	@Test
	public void zeroNodTest() {
		assertEquals(1368,Main.nod(0,1368));
		assertEquals(90,Main.nod(-90,0));
		assertEquals(Integer.MAX_VALUE,Main.nod(0,0));
	}
	
	@Test
	public void oneNodTest() {
		assertEquals(1,Main.nod(0,1));
		assertEquals(1,Main.nod(-90,1));
	}

}

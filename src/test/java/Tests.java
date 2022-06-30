import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	Calculator calculator = new Calculator();
	
	@Test
	public void twoPlusTwoEqualsFour() {
		assertEquals(4, calculator.add(2, 2), 0.02);
	}
	
	@Test
	public void twoMinusTwoEqualsFour() {
		assertEquals(0, calculator.subtract(2, 2), 0.02);
	}
	
	@Test
	public void twoTimesTwoEqualsFour() {
		assertEquals(4, calculator.multiply(2, 2), 0.02);
	}
	
	@Test
	public void twoPlusDivideEqualsFour() {
		assertEquals(1, calculator.divide(2, 2), 0.02);
	}

}

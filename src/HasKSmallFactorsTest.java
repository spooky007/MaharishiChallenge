import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HasKSmallFactorsTest {

	@Test
	void test() {
		HasKSmallFactors factors = new HasKSmallFactors(); 
		assertEquals(true, factors.hasKSmallFactors(10, 20));
		assertEquals(true, factors.hasKSmallFactors(6, 20));
		assertEquals(true, factors.hasKSmallFactors(7, 20));
		assertEquals(true, factors.hasKSmallFactors(8, 20));
		assertEquals(false, factors.hasKSmallFactors(10, 22));
		assertEquals(true, factors.hasKSmallFactors(7, 30));
		assertEquals(false, factors.hasKSmallFactors(6, 14));
		assertEquals(false, factors.hasKSmallFactors(6, 30));
	}
}

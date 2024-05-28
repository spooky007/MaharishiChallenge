import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SameNumberOfFactorsTest {

	@Test
	void test() {
		SameNumberOfFactors sameFactors = new SameNumberOfFactors();
		assertEquals(-1, sameFactors.sameNumberOfFactors(-6, 21));
		assertEquals(1, sameFactors.sameNumberOfFactors(6, 21));
		assertEquals(0, sameFactors.sameNumberOfFactors(8, 12));
		assertEquals(1, sameFactors.sameNumberOfFactors(23, 97));
		assertEquals(0, sameFactors.sameNumberOfFactors(0, 1));
		assertEquals(1, sameFactors.sameNumberOfFactors(0, 0));
	}
}

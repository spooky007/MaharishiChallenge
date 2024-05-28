import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestPrimeFactorTest {

	@Test
	void test() {
		LargestPrimeFactor largestPrime = new LargestPrimeFactor();
		assertEquals(5, largestPrime.largestPrimeFactor(10));
		assertEquals(17, largestPrime.largestPrimeFactor(6936));
		assertEquals(0, largestPrime.largestPrimeFactor(1));
	}
}

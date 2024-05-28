import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwinPrimeTest {

	@Test
	void test() {
		TwinPrime twinPrime = new TwinPrime();
		assertEquals(1, twinPrime.isTwinPrime(5));
		assertEquals(1, twinPrime.isTwinPrime(7));
		assertEquals(0, twinPrime.isTwinPrime(53));
		assertEquals(0, twinPrime.isTwinPrime(9));
	}
}

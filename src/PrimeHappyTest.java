import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeHappyTest {

	@Test
	void test() {
		PrimeHappy prime = new PrimeHappy();
		assertEquals(1, prime.isPrimeHappy(5));
		assertEquals(1, prime.isPrimeHappy(25));
		assertEquals(1, prime.isPrimeHappy(32));
		assertEquals(0, prime.isPrimeHappy(8));
		assertEquals(0, prime.isPrimeHappy(2));
	}
}

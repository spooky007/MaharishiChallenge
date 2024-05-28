import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialPrimeTest {

	@Test
	void test() {
		FactorialPrime factorial = new FactorialPrime();
		assertEquals(1, factorial.isFactorialPrime(2));
		assertEquals(1, factorial.isFactorialPrime(3));
		assertEquals(1, factorial.isFactorialPrime(7));
		assertEquals(0, factorial.isFactorialPrime(8));
		assertEquals(0, factorial.isFactorialPrime(11));
		assertEquals(0, factorial.isFactorialPrime(721));
	}
}

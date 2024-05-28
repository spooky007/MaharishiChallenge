import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeProductTest {

	@Test
	void test() {
		PrimeProduct product = new PrimeProduct();
		assertEquals(1, product.isPrimeProduct(22));
		assertEquals(1, product.isPrimeProduct(6));
		assertEquals(1, product.isPrimeProduct(10));
		assertEquals(0, product.isPrimeProduct(11));
	}
}

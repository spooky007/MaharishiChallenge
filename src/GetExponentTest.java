import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetExponentTest {

	@Test
	void getExponentTest() {
		GetExponent exponent = new GetExponent();
		assertEquals(3, exponent.getExponent(27, 3));
		assertEquals(0, exponent.getExponent(28, 3));
		assertEquals(1, exponent.getExponent(280, 7));
		assertEquals(3, exponent.getExponent(-250, 5));
		assertEquals(-1, exponent.getExponent(18, 1));
		assertEquals(3, exponent.getExponent(128, 4));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountDigitTest {

	@Test
	void test() {
		CountDigit count = new CountDigit();
		assertEquals(4, count.countDigit(33331, 3));
		assertEquals(0, count.countDigit(33331, 6));
		assertEquals(1, count.countDigit(3, 3));
		assertEquals(-1, count.countDigit(-543, 3));
	}
}

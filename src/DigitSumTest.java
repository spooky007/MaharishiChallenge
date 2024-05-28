import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitSumTest {

	@Test
	void test() {
		DigitSum digitSum = new DigitSum();
		assertEquals(1, digitSum.isDigitSum(32121, 10));
		assertEquals(0, digitSum.isDigitSum(32121, 9));
		assertEquals(1, digitSum.isDigitSum(13, 6));
		assertEquals(0, digitSum.isDigitSum(3, 3));
		assertEquals(-1, digitSum.isDigitSum(-543, 3));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitIncreasingTest {

	@Test
	void test() {
		DigitIncreasing digitIncreasing = new DigitIncreasing();
		assertEquals(1, digitIncreasing.isDigitIncreasing(7));
		assertEquals(1, digitIncreasing.isDigitIncreasing(36));
		assertEquals(1, digitIncreasing.isDigitIncreasing(984));
		assertEquals(1, digitIncreasing.isDigitIncreasing(7404));
	}
}

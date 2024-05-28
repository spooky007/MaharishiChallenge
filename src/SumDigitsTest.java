import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumDigitsTest {

	@Test
	void test() {
		SumDigits sum = new SumDigits();
		assertEquals(9, sum.sumDigits(3114));
		assertEquals(18, sum.sumDigits(-6543));
		assertEquals(0, sum.sumDigits(0));
	}
}

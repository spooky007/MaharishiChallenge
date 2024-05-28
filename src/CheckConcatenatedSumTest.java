import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckConcatenatedSumTest {

	@Test
	void test() {
		CheckConcatenatedSum sum = new CheckConcatenatedSum();
		assertEquals(1, sum.checkConcatenatedSum(198, 2));
		assertEquals(0, sum.checkConcatenatedSum(198, 3));
		assertEquals(1, sum.checkConcatenatedSum(2997, 3));
		assertEquals(0, sum.checkConcatenatedSum(2997, 2));
		assertEquals(1, sum.checkConcatenatedSum(13332, 4));
		assertEquals(1, sum.checkConcatenatedSum(9, 1));
	}
}

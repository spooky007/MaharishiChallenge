import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumFactorTest {

	@Test
	void sumFactorTest() {
		SumFactor sumFactor = new SumFactor();
		assertEquals(2, sumFactor.sumFactor(new int[] { 3, 0, 2, -5, 0 }));
		assertEquals(0, sumFactor.sumFactor(new int[] { 9, -3, -3, -1, -1 }));
		assertEquals(1, sumFactor.sumFactor(new int[] { 1 }));
		assertEquals(3, sumFactor.sumFactor(new int[] { 0, 0, 0 }));
	}

}

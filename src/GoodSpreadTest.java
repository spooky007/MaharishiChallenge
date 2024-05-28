import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GoodSpreadTest {

	@Test
	void test() {
		GoodSpread goodSpread = new GoodSpread();
		assertEquals(1, goodSpread.isGoodSpread(new int[] { 2, 1, 2, 5, 2, 1, 5, 9 }));
		assertEquals(0, goodSpread.isGoodSpread(new int[] { 3, 1, 3, 1, 3, 5, 5, 3 }));
	}
}

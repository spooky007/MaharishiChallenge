import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddHeavyTest {

	@Test
	void test() {
		OddHeavy oddHeavy = new OddHeavy();
		assertEquals(1, oddHeavy.isOddHeavy(new int[] { 1 }));
		assertEquals(0, oddHeavy.isOddHeavy(new int[] { 2 }));
		assertEquals(1, oddHeavy.isOddHeavy(new int[] { 1, 1, 1, 1, 1, 1 }));
		assertEquals(1, oddHeavy.isOddHeavy(new int[] { 2, 4, 6, 8, 11 }));
		assertEquals(0, oddHeavy.isOddHeavy(new int[] { -2 ,-4, -6, -8, -11 }));
	}
}

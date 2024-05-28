import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroLimitedTest {

	@Test
	void test() {
		ZeroLimited zeroLimited = new ZeroLimited();
		assertEquals(0, zeroLimited.isZeroLimited(new int[] { 0, 0, 0, 0, 0 }));
		assertEquals(1, zeroLimited.isZeroLimited(new int[] { 1, 0 }));
		assertEquals(0, zeroLimited.isZeroLimited(new int[] { 0, 1 }));
		assertEquals(1, zeroLimited.isZeroLimited(new int[] { 5 }));
		assertEquals(1, zeroLimited.isZeroLimited(new int[] { 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0 }));
		assertEquals(1, zeroLimited.isZeroLimited(new int[] {}));
	}
}

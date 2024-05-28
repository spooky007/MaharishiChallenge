import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZeroPlentifulTest {

	@Test
	void test() {
		ZeroPlentiful zeroPlentiful = new ZeroPlentiful();
		assertEquals(1, zeroPlentiful.isZeroPlentiful(new int[] { 0, 0, 0, 0, 0 }));
		assertEquals(2, zeroPlentiful.isZeroPlentiful(new int[] { 1, 2, 0, 0, 0, 0, 2, -18, 0, 0, 0, 0, 0, 12 }));
		assertEquals(3, zeroPlentiful.isZeroPlentiful(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0}));
		assertEquals(0, zeroPlentiful.isZeroPlentiful(new int[] { 1, 2, 3, 4 }));
		assertEquals(0, zeroPlentiful.isZeroPlentiful(new int[] { 1, 0, 0, 0, 2, 0, 0, 0, 0}));
		assertEquals(0, zeroPlentiful.isZeroPlentiful(new int[] { 0 }));
		assertEquals(0, zeroPlentiful.isZeroPlentiful(new int[] { }));
	}
}

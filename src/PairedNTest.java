import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairedNTest {

	@Test
	void test() {
		PairedN paired = new PairedN();
		assertEquals(1, paired.isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 5));
		assertEquals(1, paired.isPairedN(new int[] { 1, 4, 1, 4, 5, 6 }, 6));
		assertEquals(1, paired.isPairedN(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 }, 6));
		assertEquals(0, paired.isPairedN(new int[] { 1, 4, 1 }, 5));
		assertEquals(0, paired.isPairedN(new int[] { 8, 8, 8, 8, 7, 7, 7 }, 15));
		assertEquals(0, paired.isPairedN(new int[] { 8, -8, 8, 8, 7, 7, -7 }, -15));
		assertEquals(0, paired.isPairedN(new int[] { 3 }, 3));
		assertEquals(0, paired.isPairedN(new int[] {}, 0));
	}

}

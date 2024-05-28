import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DualTest {

	@Test
	void test() {
		Dual dual = new Dual();
		assertEquals(1, dual.isDual(new int[] { 1, 2, 3, 0 }));
		assertEquals(1, dual.isDual(new int[] { 1, 2, 2, 1, 3, 0 }));
		assertEquals(0, dual.isDual(new int[] { 1, 1, 2, 2 }));
		assertEquals(0, dual.isDual(new int[] { 1, 2, 1 }));
	}
}

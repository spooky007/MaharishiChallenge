import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrivalentTest {

	@Test
	void trivalentTest() {
		Trivalent trivalent = new Trivalent();
		assertEquals(1, trivalent.isTrivalent(new int[] { 22, 19, 10, 10, 19, 22, 22, 10 }));
		assertEquals(0, trivalent.isTrivalent(new int[] { 1, 2, 2, 2, 2, 2, 2 }));
		assertEquals(0, trivalent.isTrivalent(new int[] { 2, 2, 3, 3, 3, 3, 2, 41, 65 }));
		assertEquals(1, trivalent.isTrivalent(new int[] { -1, 0, 1, 0, 0, 0 }));
		assertEquals(0, trivalent.isTrivalent(new int[] { }));
		assertEquals(1, trivalent.isTrivalent(new int[] { 2147483647, -1, -1, -2147483648 }));
		assertEquals(0, trivalent.isTrivalent(new int[] { 1, 2 }));
	}

}

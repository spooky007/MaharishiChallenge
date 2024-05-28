import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class Centered15Test {

	@Test
	void centered15Test() {
		Centered15 centered15 = new Centered15();
		assertEquals(1, centered15.isCentered15(new int[] { 3, 2, 10, 4, 1, 6, 9 }));
		assertEquals(0, centered15.isCentered15(new int[] { 2, 10, 4, 1, 6, 9 }));
		assertEquals(0, centered15.isCentered15(new int[] { 3, 2, 10, 4, 1, 6 }));
		assertEquals(1, centered15.isCentered15(new int[] { 1, 1, 8, 3, 1, 1 }));
		assertEquals(1, centered15.isCentered15(new int[] { 9, 15, 6 }));
		assertEquals(0, centered15.isCentered15(new int[] { 1, 1, 2, 2, 1, 1 }));
		assertEquals(1, centered15.isCentered15(new int[] { 1, 1, 15 - 1, -1 }));
	}
}

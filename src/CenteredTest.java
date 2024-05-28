import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CenteredTest {

	@Test
	void test() {
		Centered centered = new Centered();
		assertEquals(0, centered.isCentered(new int[] { 5, 3, 3, 4, 5 }));
		assertEquals(1, centered.isCentered(new int[] { 3, 2, 1, 4, 5 }));
		assertEquals(0, centered.isCentered(new int[] { 3, 2, 1, 4, 1 }));
		assertEquals(0, centered.isCentered(new int[] { 3, 2, 1, 1, 4, 6 }));
		assertEquals(1, centered.isCentered(new int[] { 1 }));
	}
}

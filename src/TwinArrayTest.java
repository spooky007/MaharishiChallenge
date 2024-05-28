import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwinArrayTest {

	@Test
	void test() {
		TwinArray twin = new TwinArray();
		assertEquals(1, twin.isTwin(new int[] { 3, 5, 8, 10, 27 }));
		assertEquals(1, twin.isTwin(new int[] { 11, 9, 12, 13, 23 }));
		assertEquals(1, twin.isTwin(new int[] { 5, 3, 14, 7, 18, 67 }));
		assertEquals(0, twin.isTwin(new int[] { 13, 14, 15, 3, 5 }));
		assertEquals(0, twin.isTwin(new int[] { 1, 17, 8, 25, 67 }));
	}
}

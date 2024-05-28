import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Is235ArrayTest {

	@Test
	void test() {
		Is235Array is235Array = new Is235Array();
		assertEquals(1, is235Array.is235Array(new int[] { 2, 3, 5, 7, 11 }));
		assertEquals(0, is235Array.is235Array(new int[] { 2, 3, 6, 7, 11 }));
		assertEquals(0, is235Array.is235Array(new int[] { 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
		assertEquals(1, is235Array.is235Array(new int[] { 2, 4, 8, 16, 32 }));
		assertEquals(1, is235Array.is235Array(new int[] { 3, 9, 27, 7, 1, 1, 1, 1, 1 }));
		assertEquals(1, is235Array.is235Array(new int[] { 7, 11, 77, 49 }));
		assertEquals(1, is235Array.is235Array(new int[] { 2 }));
		assertEquals(1, is235Array.is235Array(new int[] {}));
		assertEquals(1, is235Array.is235Array(new int[] { 7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7 }));
	}
}

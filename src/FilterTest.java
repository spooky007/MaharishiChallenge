import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilterTest {

	@Test
	void test() {
		Filter filter = new Filter();
		assertEquals(1, filter.isFilter(new int[] { 1, 2, 3, 9, 6, 11 }));
		assertEquals(1, filter.isFilter(new int[] { 3, 4, 6, 7, 14, 16 }));
		assertEquals(1, filter.isFilter(new int[] { 1, 2, 3, 4, 10, 11, 13 }));
		assertEquals(1, filter.isFilter(new int[] { 3, 6, 5, 5, 13, 6, 13 }));
		assertEquals(0, filter.isFilter(new int[] { 9, 6, 18 }));
		assertEquals(0, filter.isFilter(new int[] { 4, 7, 13 }));
	}
}

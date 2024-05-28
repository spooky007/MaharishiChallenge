import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilterArrayTest {

	@Test
	void filterArrayTest() {
		FilterArray filter = new FilterArray();
		assertArrayEquals(new int[] {}, filter.filterArray(new int[] { 9, -9 }, 0));
		assertArrayEquals(new int[] { 9 }, filter.filterArray(new int[] { 9, -9 }, 1));
		assertArrayEquals(new int[] { -9 }, filter.filterArray(new int[] { 9, -9 }, 2));
		assertArrayEquals(new int[] { 9, -9 }, filter.filterArray(new int[] { 9, -9 }, 3));
		assertArrayEquals(null, filter.filterArray(new int[] { 9, -9 }, 4));
		assertArrayEquals(new int[] { 9, -9 }, filter.filterArray(new int[] { 9, -9, 5 }, 3));
		assertArrayEquals(new int[] { 0, 9, 18 }, filter.filterArray(new int[] { 0, 9, 12, 18, -6 }, 11));
	}
}

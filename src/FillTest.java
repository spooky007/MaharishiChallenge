import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FillTest {

	@Test
	void test() {
		Fill fill = new Fill();
		assertArrayEquals(new int[] { 1, 2, 3, 1, 2, 3, 1, 2, 3, 1 },
				fill.fill(new int[] { 1, 2, 3, 5, 9, 12, -2, -1 }, 3, 10));
		assertArrayEquals(new int[] { 4, 4, 4, 4, 4 }, fill.fill(new int[] { 4, 2, -3, 12 }, 1, 5));
		assertArrayEquals(null, fill.fill(new int[] { 2, 6, 9, 0, -3 }, 0, 4));
	}
}

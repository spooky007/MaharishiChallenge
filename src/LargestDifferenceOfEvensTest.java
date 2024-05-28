import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LargestDifferenceOfEvensTest {

	@Test
	void test() {
		LargestDifferenceOfEvens largestDiff = new LargestDifferenceOfEvens();
		assertEquals(-1, largestDiff.largestDifferenceOfEvens(new int[] { 1, 3, 5, 9 }));
		assertEquals(-1, largestDiff.largestDifferenceOfEvens(new int[] { 1, 18, 5, 7, 33 }));
		assertEquals(0, largestDiff.largestDifferenceOfEvens(new int[] { 2, 2, 2, 2 }));
		assertEquals(4, largestDiff.largestDifferenceOfEvens(new int[] { 1, 2, 1, 2, 1, 4, 1, 6, 4 }));
	}

}

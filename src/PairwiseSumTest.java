import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairwiseSumTest {

	@Test
	void test() {
		PairwiseSum pair = new PairwiseSum();
		assertArrayEquals(new int[] { 3, 13 }, pair.pairwiseSum(new int[] { 2, 1, 18, -5 }));
		assertArrayEquals(new int[] { 3, 13, -20, 0, 0 },
				pair.pairwiseSum(new int[] { 2, 1, 18, -5, -5, -15, 0, 0, 1, -1 }));
		assertArrayEquals(null, pair.pairwiseSum(new int[] { 2, 1, 18 }));
		assertArrayEquals(null, pair.pairwiseSum(new int[] {}));
	}
}

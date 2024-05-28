import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntegerBasedRoundingTest {

	@Test
	void test() {
		int[] input1 = new int[] { 1, 2, 3, 4, 5 };
		int[] input2 = new int[] { 1, 2, 3, 4, 5 };
		int[] input3 = new int[] { 1, 2, 3, 4, 5 };
		int[] input4 = new int[] { -1, -2, -3, -4, -5 };
		int[] input5 = new int[] { -18, 1, 2, 3, 4, 5 };
		int[] input6 = new int[] { 1, 2, 3, 4, 5 };
		int[] input7 = new int[] { 1, 2, 3, 4, 5 };

		IntegerBasedRounding rounding = new IntegerBasedRounding();
		rounding.doIntegerBasedRounding(input1, 2);
		rounding.doIntegerBasedRounding(input2, 3);
		rounding.doIntegerBasedRounding(input3, -3);
		rounding.doIntegerBasedRounding(input4, 3);
		rounding.doIntegerBasedRounding(input5, 4);
		rounding.doIntegerBasedRounding(input6, 5);
		rounding.doIntegerBasedRounding(input7, 100);

		assertArrayEquals(new int[] { 2, 2, 4, 4, 6 }, input1);
		assertArrayEquals(new int[] { 0, 3, 3, 3, 6 }, input2);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, input3);
		assertArrayEquals(new int[] { -1, -2, -3, -4, -5 }, input4);
		assertArrayEquals(new int[] { -18, 0, 4, 4, 4, 4 }, input5);
		assertArrayEquals(new int[] { 0, 0, 5, 5, 5 }, input6);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, input7);

	}

}

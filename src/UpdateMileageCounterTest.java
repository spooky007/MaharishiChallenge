import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UpdateMileageCounterTest {

	@Test
	void test() {
		int[] input1 = { 8, 9, 9, 5, 0 };
		int[] input2 = { 8, 9, 9, 5, 0 };
		int[] input3 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		int[] input4 = { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 };
		UpdateMileageCounter counter = new UpdateMileageCounter();
		counter.updateMileageCounter(input1, 1);
		counter.updateMileageCounter(input2, 2);
		counter.updateMileageCounter(input3, 1);
		counter.updateMileageCounter(input4, 13);

		assertArrayEquals(new int[] { 9, 9, 9, 5, 0 }, input1);
		assertArrayEquals(new int[] { 0, 0, 0, 6, 0 }, input2);
		assertArrayEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, input3);
		assertArrayEquals(new int[] { 2, 1, 0, 0, 0, 0, 0, 0, 0, 0}, input4);
	}

}

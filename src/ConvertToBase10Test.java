import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConvertToBase10Test {

	@Test
	void convertToBase10Test() {
		ConvertToBase10 convert = new ConvertToBase10();
		assertEquals(11, convert.convertToBase10(new int[] {1, 0, 1, 1}, 2));
		assertEquals(14, convert.convertToBase10(new int[] {1, 1, 2}, 3));
		assertEquals(213, convert.convertToBase10(new int[] {3, 2, 5}, 8));
		assertEquals(0, convert.convertToBase10(new int[] {3, 7, 1}, 6));

	}

}

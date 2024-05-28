import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddValentTest {

	@Test
	void test() {
		OddValent oddValent = new OddValent();
		assertEquals(1, oddValent.isOddValent(new int[] { 9, 3, 4, 9, 1 }));
		assertEquals(1, oddValent.isOddValent(new int[] { 3, 3, 3, 3 }));
		assertEquals(1, oddValent.isOddValent(new int[] { 8, 8, 8, 4, 4, 7, 2 }));
		assertEquals(0, oddValent.isOddValent(new int[] { 1, 2, 3, 4, 5 }));
		assertEquals(0, oddValent.isOddValent(new int[] { 2, 2, 2, 4, 4 }));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagicArrayTest {

	@Test
	void test() {
		MagicArray magicArray = new MagicArray();
		assertEquals(1, magicArray.isMagicArray(new int[] {21, 3, 7, 9, 11, 4, 6}));
		assertEquals(1, magicArray.isMagicArray(new int[] {13, 4, 4, 4, 4}));
		assertEquals(1, magicArray.isMagicArray(new int[] {10, 5, 5}));
		assertEquals(1, magicArray.isMagicArray(new int[] {0, 6, 8, 20}));
		assertEquals(1, magicArray.isMagicArray(new int[] {3}));
		assertEquals(0, magicArray.isMagicArray(new int[] {8, 5, -5, 5, 3}));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PackedTest {

	@Test
	void PackedTest() {
		Packed packed = new Packed();
		assertEquals(1, packed.isPacked(new int[] { 2, 2, 1 }));
		assertEquals(0, packed.isPacked(new int[] { 2, 2, 1, 2, 2 }));
		assertEquals(1, packed.isPacked(new int[] { 4, 4, 4, 4, 1, 2, 2, 3, 3, 3 }));
		assertEquals(1, packed.isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7, 1 }));
		assertEquals(0, packed.isPacked(new int[] { 7, 7, 7, 7, 1, 7, 7, 7 }));
		assertEquals(1, packed.isPacked(new int[] { 7, 7, 7, 7, 7, 7, 7 }));
		assertEquals(1, packed.isPacked(new int[] {}));
		assertEquals(0, packed.isPacked(new int[] { 1, 2, 1 }));
		assertEquals(0, packed.isPacked(new int[] { 2, 1, 1 }));
		assertEquals(0, packed.isPacked(new int[] { -3, -3, -3 }));
		assertEquals(0, packed.isPacked(new int[] { 0, 2, 2 }));
		assertEquals(0, packed.isPacked(new int[] { 2, 1, 2 }));
	}
}

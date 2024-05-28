import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NPrimeableTest {

	@Test
	void test() {
		NPrimeable nPrimeable = new NPrimeable();
		assertEquals(1, nPrimeable.isNPrimeable(new int[] { 5, 15, 27 }, 2));
		assertEquals(0, nPrimeable.isNPrimeable(new int[] { 5, 15, 27 }, 3));
		assertEquals(0, nPrimeable.isNPrimeable(new int[] { 5, 15, 26 }, 2));
		assertEquals(1, nPrimeable.isNPrimeable(new int[] { 1, 1, 1, 1, 1, 1, 1 }, 4));
		assertEquals(1, nPrimeable.isNPrimeable(new int[] {}, 2));
	}
}

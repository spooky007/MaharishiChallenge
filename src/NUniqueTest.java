import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NUniqueTest {

	@Test
	void nUniquqTest() {
		NUnique nUnique = new NUnique();
		assertEquals(0, nUnique.isNUnique(new int[] { 7, 3, 3, 2, 4 }, 6));
		assertEquals(0, nUnique.isNUnique(new int[] { 7, 3, 3, 2, 4 }, 10));
		assertEquals(1, nUnique.isNUnique(new int[] { 7, 3, 3, 2, 4 }, 11));
		assertEquals(0, nUnique.isNUnique(new int[] { 7, 3, 3, 2, 4 }, 8));
		assertEquals(0, nUnique.isNUnique(new int[] { 7, 3, 3, 2, 4 }, 4));
		assertEquals(0, nUnique.isNUnique(new int[] { 1 }, 6));
	}

}

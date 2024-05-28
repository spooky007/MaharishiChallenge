import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TripleArrayTest {

	@Test
	void test() {
		TripleArray triple = new TripleArray();
		assertEquals(1, triple.isTriple(new int[] { 3, 1, 2, 1, 3, 1, 3, 2, 2 }));
		assertEquals(0, triple.isTriple(new int[] { 2, 5, 2, 5, 5, 2, 5 }));
		assertEquals(0, triple.isTriple(new int[] { 3, 1, 1, 1 }));
	}

}

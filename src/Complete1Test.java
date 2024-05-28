import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Complete1Test {

	@Test
	void test() {
		Complete1 complete = new Complete1();
		assertEquals(1, complete.isComplete(new int[] { -5, 6, 2, 3, 2, 4, 5, 11, 8, 7 }));
		assertEquals(0, complete.isComplete(new int[] { 5, 7, 9, 13 }));
		assertEquals(0, complete.isComplete(new int[] { 2, 2 }));
		assertEquals(0, complete.isComplete(new int[] { 2, 6, 3, 4 }));

	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompleteTest {

	@Test
	void test() {
		Complete complete = new Complete();
		assertEquals(1, complete.isComplete(new int[] { 36, -28 }));
		assertEquals(0, complete.isComplete(new int[] { 36, 28 }));
		assertEquals(0, complete.isComplete(new int[] { 4 }));
		assertEquals(0, complete.isComplete(new int[] { 3, 2, 1, 1, 5, 6 }));
		assertEquals(0, complete.isComplete(new int[] { 3, 7, 23, 13, 107, -99, 97, 81 }));
	}
}

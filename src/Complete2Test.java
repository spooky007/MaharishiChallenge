import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Complete2Test {

	@Test
	void test() {
		Complete2 complete = new Complete2();
		assertEquals(1, complete.isComplete(new int[] { 2, 3, 2, 4, 11, 6, 10, 9, 8 }));
		assertEquals(0, complete.isComplete(new int[] { 2, 3, 3, 6 }));
		assertEquals(0, complete.isComplete(new int[] { 2, -3, 4, 3, 6 }));
	}
}

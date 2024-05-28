import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackedTest {

	@Test
	void StackedTest() {
		Stacked stack = new Stacked();
		assertEquals(1, stack.isStacked(1));
		assertEquals(1, stack.isStacked(3));
		assertEquals(1, stack.isStacked(6));
		assertEquals(1, stack.isStacked(10));
		assertEquals(0, stack.isStacked(7));
		assertEquals(0, stack.isStacked(8));
		assertEquals(0, stack.isStacked(9));
	}
}

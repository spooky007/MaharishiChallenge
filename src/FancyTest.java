import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FancyTest {

	@Test
	void test() {
		Fancy fancy = new Fancy();
		assertEquals(1, fancy.isFancy(5));
		assertEquals(1, fancy.isFancy(17));
		assertEquals(1, fancy.isFancy(61));
		assertEquals(0, fancy.isFancy(45));
		assertEquals(0, fancy.isFancy(54));
		assertEquals(0, fancy.isFancy(50));
	}
}

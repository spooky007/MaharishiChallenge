import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorEqualTest {

	@Test
	void test() {
		FactorEqual factor = new FactorEqual();
		assertEquals(1, factor.isFactorEqual(10, 33));
		assertEquals(0, factor.isFactorEqual(9, 10));
	}
}

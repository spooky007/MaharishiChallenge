import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorTwoCountTest {

	@Test
	void test() {
		FactorTwoCount count = new FactorTwoCount();
		assertEquals(4, count.factorTwoCount(48));
		assertEquals(0, count.factorTwoCount(27));
	}
}

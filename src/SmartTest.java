import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmartTest {

	@Test
	void test() {
		Smart smart = new Smart();
		assertEquals(1, smart.isSmart(11));
		assertEquals(1, smart.isSmart(22));
		assertEquals(0, smart.isSmart(8));
	}
}

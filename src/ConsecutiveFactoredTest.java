import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConsecutiveFactoredTest {

	@Test
	void test() {
		ConsecutiveFactored consecutive = new ConsecutiveFactored();
		assertEquals(1, consecutive.isConsecutiveFactored(24));
		assertEquals(0, consecutive.isConsecutiveFactored(105));
		assertEquals(1, consecutive.isConsecutiveFactored(90));
		assertEquals(0, consecutive.isConsecutiveFactored(23));
		assertEquals(0, consecutive.isConsecutiveFactored(15));
		assertEquals(0, consecutive.isConsecutiveFactored(2));
		assertEquals(0, consecutive.isConsecutiveFactored(0));
		assertEquals(0, consecutive.isConsecutiveFactored(-12));
	}
}

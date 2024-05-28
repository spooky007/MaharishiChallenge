import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsolatedTest {

	@Test
	void IsolatedTest() {
		Isolated isolated = new Isolated();
		assertEquals(1, isolated.isIsolated(163));
		assertEquals(0, isolated.isIsolated(162));
		assertEquals(1, isolated.isIsolated(2));
		assertEquals(1, isolated.isIsolated(3));
		assertEquals(1, isolated.isIsolated(8));
		assertEquals(1, isolated.isIsolated(9));
		assertEquals(1, isolated.isIsolated(14));
		assertEquals(1, isolated.isIsolated(24));
		assertEquals(1, isolated.isIsolated(28));
		assertEquals(1, isolated.isIsolated(34));
		assertEquals(1, isolated.isIsolated(58));
		assertEquals(1, isolated.isIsolated(63));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NormalTest {

	@Test
	void test() {
		Normal normal = new Normal();
		assertEquals(1, normal.isNormal(1));
		assertEquals(1, normal.isNormal(2));
		assertEquals(1, normal.isNormal(3));
		assertEquals(1, normal.isNormal(4));
		assertEquals(1, normal.isNormal(5));
		assertEquals(1, normal.isNormal(7));
		assertEquals(1, normal.isNormal(8));
		assertEquals(0, normal.isNormal(6));
		assertEquals(0, normal.isNormal(9));
	}
}

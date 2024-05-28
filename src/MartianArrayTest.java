import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MartianArrayTest {

	@Test
	void test() {
		MartianArray martian = new MartianArray();
		assertEquals(1, martian.isMartian(new int[] { 1, 3 }));
		assertEquals(1, martian.isMartian(new int[] { 1, 2, 1, 2, 1, 2, 1, 2, 1 }));
		assertEquals(0, martian.isMartian(new int[] { 1, 3, 2 }));
		assertEquals(0, martian.isMartian(new int[] { 1, 3, 2, 2, 1, 5, 1, 5 }));
		assertEquals(0, martian.isMartian(new int[] { 1, 2, -18, -18, 1, 2 }));
		assertEquals(0, martian.isMartian(new int[] {}));
		assertEquals(1, martian.isMartian(new int[] { 1 }));
		assertEquals(0, martian.isMartian(new int[] { 2 }));
	}
}

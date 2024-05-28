import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NiceArrayTest {

	@Test
	void test() {
		NiceArray nice = new NiceArray();
		assertEquals(1, nice.isNice(new int[] { 2, 10, 9, 3 }));
		assertEquals(1, nice.isNice(new int[] { 2, 2, 3, 3, 3 }));
		assertEquals(1, nice.isNice(new int[] { 1, 1, 1, 2, 1, 1 }));
		assertEquals(1, nice.isNice(new int[] { 0, 1, 1 }));
		assertEquals(0, nice.isNice(new int[] { 3, 4, 5, 7 }));
	}
}

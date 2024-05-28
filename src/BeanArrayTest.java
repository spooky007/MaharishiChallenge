import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeanArrayTest {

	@Test
	void test() {
		BeanArray bean = new BeanArray();
		assertEquals(1, bean.isBeanArray(new int[] { 1, 2, 3, 9, 6, 13 }));
		assertEquals(1, bean.isBeanArray(new int[] { 3, 4, 6, 7, 13, 15 }));
		assertEquals(1, bean.isBeanArray(new int[] { 1, 2, 3, 4, 10, 11, 12 }));
		assertEquals(1, bean.isBeanArray(new int[] { 3, 6, 9, 5, 7, 13, 6, 17 }));
		assertEquals(0, bean.isBeanArray(new int[] { 9, 6, 18 }));
		assertEquals(0, bean.isBeanArray(new int[] { 4, 7, 16 }));
	}
}

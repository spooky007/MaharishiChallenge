import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeanArray1Test {

	@Test
	void test() {
		BeanArray1 bean = new BeanArray1();
		assertEquals(1, bean.isBeanArray(new int[] { 4, 9, 8 }));
		assertEquals(1, bean.isBeanArray(new int[] { 2, 2, 5, 11, 23 }));
		assertEquals(1, bean.isBeanArray(new int[] { 7, 7, 3, 6 }));
		assertEquals(1, bean.isBeanArray(new int[] { 0 }));
		assertEquals(0, bean.isBeanArray(new int[] { 3, 8, 4 }));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Is121ArrayTest {

	@Test
	void Is121ArrayTest() {
		Is121Array array = new Is121Array();
		assertEquals(1, array.is121Array(new int[] { 1, 2, 1 }));
		assertEquals(1, array.is121Array(new int[] { 1, 1, 2, 2, 2, 1, 1 }));
		assertEquals(0, array.is121Array(new int[] { 1, 1, 2, 1, 1, 1 }));
		assertEquals(0, array.is121Array(new int[] { 1, 1, 2, 1, 2, 1, 1 }));
		assertEquals(0, array.is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 1, 3 }));
		assertEquals(0, array.is121Array(new int[] { 1, 1, 1, 1, 1, 1 }));
		assertEquals(0, array.is121Array(new int[] { 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1 }));
		assertEquals(0, array.is121Array(new int[] { 1, 1, 1, 2, 2, 2, 1, 1, 2, 2 }));
		assertEquals(0, array.is121Array(new int[] { 2, 2, 2 }));
	}
}

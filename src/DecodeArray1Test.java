import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeArray1Test {

	@Test
	void test() {
		DecodeArray1 decodeArray = new DecodeArray1();
		assertEquals(0, decodeArray.decodeArray(new int[] { 1 }));
		assertEquals(1, decodeArray.decodeArray(new int[] { 0, 1 }));
		assertEquals(-1, decodeArray.decodeArray(new int[] { -1, 0, 1 }));
		assertEquals(100001, decodeArray.decodeArray(new int[] { 0, 1, 1, 1, 1, 1, 0, 1 }));
		assertEquals(999, decodeArray.decodeArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }));

	}

}

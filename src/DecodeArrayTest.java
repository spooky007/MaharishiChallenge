import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DecodeArrayTest {

	@Test
	void test() {
		DecodeArray decode = new DecodeArray();
		assertEquals(3344, decode.decodeArray(new int[] { 0, -3, 0, -4, 0 }));
		assertEquals(-6392, decode.decodeArray(new int[] { -1, 5, 8, 17, 15 }));
		assertEquals(4392, decode.decodeArray(new int[] { 1, 5, 8, 17, 15 }));
		assertEquals(4392, decode.decodeArray(new int[] { 111, 115, 118, 127, 125 }));
		assertEquals(0, decode.decodeArray(new int[] { 1, 1 }));
	}
}

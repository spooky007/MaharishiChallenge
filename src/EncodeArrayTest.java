import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncodeArrayTest {

	@Test
	void test() {
		EncodeArray encodeArray = new EncodeArray();
		assertArrayEquals(new int[] { 1 }, encodeArray.encodeArray(0));
		assertArrayEquals(new int[] { 0, 1 }, encodeArray.encodeArray(1));
		assertArrayEquals(new int[] { -1, 0, 1 }, encodeArray.encodeArray(-1));
		assertArrayEquals(new int[] { 0, 1, 1, 1, 1, 1, 0, 1 }, encodeArray.encodeArray(100001));
		assertArrayEquals(
				new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
				encodeArray.encodeArray(999));
	}
}

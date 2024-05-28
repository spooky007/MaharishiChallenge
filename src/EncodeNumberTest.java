import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncodeNumberTest {

	@Test
	void test() {
		EncodeNumber encodedNum = new EncodeNumber();
		assertArrayEquals(new int[] { 2 }, encodedNum.encodeNumber(2));
		assertArrayEquals(new int[] { 2, 3 }, encodedNum.encodeNumber(6));
		assertArrayEquals(new int[] { 2, 7 }, encodedNum.encodeNumber(14));
		assertArrayEquals(new int[] { 2, 2, 2, 3 }, encodedNum.encodeNumber(24));
		assertArrayEquals(new int[] { 2, 2, 2, 2, 3, 5, 5 }, encodedNum.encodeNumber(1200));
		assertArrayEquals(null, encodedNum.encodeNumber(1));
		assertArrayEquals(null, encodedNum.encodeNumber(-18));

	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FineArrayTest {

	@Test
	void test() {
		FineArray fineArray = new FineArray();
		assertEquals(1, fineArray.isFineArray(new int[] { 4, 7, 9, 6, 5 }));
		assertEquals(1, fineArray.isFineArray(new int[] { 4, 9, 6, 33 }));
		assertEquals(0, fineArray.isFineArray(new int[] { 3, 8, 15 }));
	}
}

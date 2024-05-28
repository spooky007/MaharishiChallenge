import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BunkerArray1Test {

	@Test
	void test() {
		BunkerArray1 bunker = new BunkerArray1();
		assertEquals(1, bunker.isBunkerArray1(new int[] { 7, 6, 10, 1 }));
		assertEquals(0, bunker.isBunkerArray1(new int[] { 7, 6, 10 }));
		assertEquals(0, bunker.isBunkerArray1(new int[] { 6, 10, 1 }));
		assertEquals(1, bunker.isBunkerArray1(new int[] { 3, 7, 1, 8, 1 }));
	}

}

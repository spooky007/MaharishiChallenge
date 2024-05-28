import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BunkerArrayTest {

	@Test
	void test() {
		BunkerArray bunker = new BunkerArray();
		assertEquals(1, bunker.isBunkerArray(new int[] { 4, 9, 6, 7, 3 }));
		assertEquals(0, bunker.isBunkerArray(new int[] { 4, 9, 6, 15, 21 }));

	}

}

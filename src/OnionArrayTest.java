import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OnionArrayTest {

	@Test
	void test() {
		OnionArray onion = new OnionArray();
		assertEquals(1, onion.isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
		assertEquals(0, onion.isOnionArray(new int[] { 1, 2, 3, 4, 15 }));
		assertEquals(0, onion.isOnionArray(new int[] { 1, 3, 9, 8 }));
		assertEquals(1, onion.isOnionArray(new int[] { 2 }));
		assertEquals(1, onion.isOnionArray(new int[] {}));
		assertEquals(1, onion.isOnionArray(new int[] { -2, 5, 0, 5, 12 }));
	}
}

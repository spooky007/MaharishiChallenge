import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LayeredTest {

	@Test
	void test() {
		Layered layered = new Layered();
		assertEquals(1, layered.isLayered(new int[] { 1, 1, 2, 2, 2, 3, 3 }));
		assertEquals(1, layered.isLayered(new int[] { 3, 3, 3, 3, 3, 3, 3 }));
		assertEquals(0, layered.isLayered(new int[] { 1, 2, 2, 2, 3, 3 }));
		assertEquals(0, layered.isLayered(new int[] { 2, 2, 2, 3, 3, 1, 1 }));
		assertEquals(0, layered.isLayered(new int[] { 2 }));
		assertEquals(0, layered.isLayered(new int[] {}));
	}
}

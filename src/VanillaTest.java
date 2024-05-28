import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VanillaTest {

	@Test
	void VanillaTest() {
		Vanilla vanilla = new Vanilla();
		assertEquals(1, vanilla.isVanilla(new int[] { 1 }));
		assertEquals(0, vanilla.isVanilla(new int[] { 11, 22, 13, 34, 125 }));
		assertEquals(1, vanilla.isVanilla(new int[] { 9, 999, 99999, -9999 }));
		assertEquals(1, vanilla.isVanilla(new int[] {}));
		assertEquals(1, vanilla.isVanilla(new int[] { 1, 1, 11, 1111, 1111111 }));
		assertEquals(0, vanilla.isVanilla(new int[] { 11, 101, 1111, 11111 }));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Meera1Test {

	@Test
	void test() {
		Meera1 meera = new Meera1();
		assertEquals(1, meera.isMeera(new int[] { 7, 9, 0, 10, 1 }));
		assertEquals(1, meera.isMeera(new int[] { 6, 10, 8 }));
		assertEquals(0, meera.isMeera(new int[] { 7, 6, 1 }));
		assertEquals(0, meera.isMeera(new int[] { 9, 10, 0 }));
		assertEquals(1, meera.isMeera(new int[] { 1, 1, 0, 8, 0, 9, 9, 1 }));
	}
}

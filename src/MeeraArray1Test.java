import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeeraArray1Test {

	@Test
	void test() {
		MeeraArray1 meera = new MeeraArray1();
		assertEquals(1, meera.isMeera(new int[] { 7, 6, 0, 10, 1 }));
		assertEquals(1, meera.isMeera(new int[] { 6, 10, 1 }));
		assertEquals(0, meera.isMeera(new int[] { 7, 6, 10 }));
		assertEquals(0, meera.isMeera(new int[] { 6, 10, 0 }));
	}
}

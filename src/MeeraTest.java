import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeeraTest {

	@Test
	void test() {
		Meera meera = new Meera();
		assertEquals(1, meera.isMeera(new int[] { -4, 0, 1, 0, 2, 1 }));
		assertEquals(0, meera.isMeera(new int[] { -8, 0, 0, 8, 0 }));
		assertEquals(0, meera.isMeera(new int[] {-8, 0, 0, 2, 0}));
	}
}

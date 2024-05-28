import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MeeraArrayTest {

	@Test
	void test() {
		MeeraArray meera = new MeeraArray();
		assertEquals(1, meera.isMeera(new int[] {3, 5, -2}));
		assertEquals(0, meera.isMeera(new int[] {8, 3, 4} ));
		assertEquals(1, meera.isMeera(new int[] {3, 5, -2}));
	}
}

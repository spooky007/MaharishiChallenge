import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HenryTest {

	@Test
	void henryTest() {
		Henry henry = new Henry();
		assertEquals(502, henry.henry(1, 3));
	}

}

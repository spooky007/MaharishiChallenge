import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PorcupineNumberTest {

	@Test
	void testPorcupineNumber() {
		PorcupineNumber pNumber = new PorcupineNumber();
		assertEquals(139, pNumber.findPorcupineNumber(2));
	}

}

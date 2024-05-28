import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvensTest {

	@Test
	void test() {
		Evens evens = new Evens();
		assertEquals(1, evens.isEvens(2426));
		assertEquals(0, evens.isEvens(3224));
		assertEquals(0, evens.isEvens(2436));
	}
}

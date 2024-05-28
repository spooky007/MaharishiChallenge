import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountOnesTest {

	@Test
	void test() {
		CountOnes countOnes = new CountOnes();
		assertEquals(2, countOnes.countOnes(9));
		assertEquals(2, countOnes.countOnes(5));
		assertEquals(4, countOnes.countOnes(15));
	}
}

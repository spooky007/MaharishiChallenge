import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaphneTest {

	@Test
	void test() {
		Daphne daphne = new Daphne();
		assertEquals(1, daphne.isDaphne(new int[] { 4, 8, 6, 3, 2, 9, 8, 11, 8, 13, 12, 12, 6 }));
		assertEquals(0, daphne.isDaphne(new int[] { 2, 4, 6, 8, 6 }));
		assertEquals(0, daphne.isDaphne(new int[] {2, 8, 7, 10, -4, 6} ));
	}
}

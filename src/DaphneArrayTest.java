import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DaphneArrayTest {

	@Test
	void test() {
		DaphneArray daphne = new DaphneArray();
		assertEquals(1, daphne.isDaphneArray(new int[] { 2, 4, 2 }));
		assertEquals(1, daphne.isDaphneArray(new int[] { 1, 3, 17, -5 }));
		assertEquals(0, daphne.isDaphneArray(new int[] { 3, 2, 5 }));
	}
}

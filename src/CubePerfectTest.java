import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubePerfectTest {

	@Test
	void test() {
		CubePerfect cube = new CubePerfect();
		assertEquals(1, cube.isCubePerfect(new int[] { 1, 1, 1, 1 }));
		assertEquals(1, cube.isCubePerfect(new int[] { 64 }));
		assertEquals(0, cube.isCubePerfect(new int[] { 63 }));
		assertEquals(1, cube.isCubePerfect(new int[] { -1, 0, 1 }));
		assertEquals(1, cube.isCubePerfect(new int[] {}));
		assertEquals(0, cube.isCubePerfect(new int[] { 3, 7, 21, 36 }));
	}
}

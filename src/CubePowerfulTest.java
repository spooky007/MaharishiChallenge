import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubePowerfulTest {

	@Test
	void test() {
		CubePowerful cube = new CubePowerful();
		assertEquals(1, cube.isCubePowerful(153));
		assertEquals(1, cube.isCubePowerful(370));
		assertEquals(1, cube.isCubePowerful(371));
		assertEquals(1, cube.isCubePowerful(407));
		assertEquals(0, cube.isCubePowerful(87));
		assertEquals(0, cube.isCubePowerful(0));
		assertEquals(0, cube.isCubePowerful(-81));
	}
}

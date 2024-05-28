import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class InertialTest {

	@Test
	void test() {
		Inertial inert = new Inertial();
		assertEquals(0, inert.isInertial(new int[] { 1 }));
		assertEquals(0, inert.isInertial(new int[] { 2 }));
		assertEquals(0, inert.isInertial(new int[] { 1, 2, 3, 4 }));
		assertEquals(1, inert.isInertial(new int[] { 1, 1, 1, 1, 1, 1, 1, 2 }));
		assertEquals(1, inert.isInertial(new int[] { 2, 12, 4, 6, 8, 11 }));
		assertEquals(1, inert.isInertial(new int[] { 2, 12, 12, 4, 6, 8, 11 }));
		assertEquals(0, inert.isInertial(new int[] { -2, -4, -6, -8, -11 }));
		assertEquals(0, inert.isInertial(new int[] { 2, 3, 5, 7 }));
		assertEquals(0, inert.isInertial(new int[] { 2, 4, 6, 8, 10 }));

	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangularTest {

	@Test
	void test() {
		Triangular triangular = new Triangular();
		assertEquals(1, triangular.isTriangular(1));
		assertEquals(1, triangular.isTriangular(3));
		assertEquals(1, triangular.isTriangular(6));
		assertEquals(1, triangular.isTriangular(10));
		assertEquals(0, triangular.isTriangular(11));
		assertEquals(0, triangular.isTriangular(12));
	}
}

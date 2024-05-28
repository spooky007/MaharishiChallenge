import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void squareTest() {
		Square square = new Square();
		assertEquals(1, square.isSquare(4));
		assertEquals(1, square.isSquare(25));
		assertEquals(0, square.isSquare(-4));
		assertEquals(0, square.isSquare(8));
		assertEquals(1, square.isSquare(0));
	}
}

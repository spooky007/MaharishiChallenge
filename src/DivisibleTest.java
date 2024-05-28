import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisibleTest {

	@Test
	void divisibleTest() {
		Divisible divisible = new Divisible();
		assertEquals(1, divisible.isDivisible(new int[] { 3, 3, 6, 36 }, 3));
		assertEquals(1, divisible.isDivisible(new int[] { 4 }, 2));
		assertEquals(0, divisible.isDivisible(new int[] { 3, 4, 3, 6, 36 }, 3));
		assertEquals(0, divisible.isDivisible(new int[] { 6, 12, 24, 36 }, 12));
		assertEquals(1, divisible.isDivisible(new int[] {}, 3));

	}

}

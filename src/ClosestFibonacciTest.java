import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClosestFibonacciTest {

	@Test
	void test() {
		ClosestFibonacci fibo = new ClosestFibonacci();
		assertEquals(13, fibo.isClosestFibonacci(13));
		assertEquals(21, fibo.isClosestFibonacci(33));
		assertEquals(34, fibo.isClosestFibonacci(34));
	}
}

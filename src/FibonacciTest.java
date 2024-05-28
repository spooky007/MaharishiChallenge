import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FibonacciTest {

	@Test
	void test() {
		Fibonacci fibo = new Fibonacci();
		assertEquals(1, fibo.isFibonacci(1));
		assertEquals(1, fibo.isFibonacci(13));
		assertEquals(0, fibo.isFibonacci(27));
		assertEquals(1, fibo.isFibonacci(3));
		assertEquals(1, fibo.isFibonacci(5));
		assertEquals(1, fibo.isFibonacci(8));
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EvalTest {

	@Test
	void test() {
		Eval eval = new Eval();
		assertEquals(10.0, eval.eval(1.0, new int[] { 0, 1, 2, 3, 4 }));
		assertEquals(18.0, eval.eval(3.0, new int[] { 3, 2, 1 }));
		assertEquals(-5.0, eval.eval(2.0, new int[] { 3, -2, -1 }));
		assertEquals(6.0, eval.eval(-3.0, new int[] { 3, 2, 1 }));
		assertEquals(7.0, eval.eval(2.0, new int[] { 3, 2 }));
		assertEquals(40.0, eval.eval(2.0, new int[] { 4, 0, 9 }));
		assertEquals(10.0, eval.eval(2.0, new int[] { 10 }));
		assertEquals(10.0, eval.eval(10.0, new int[] { 0, 1 }));
	}
}

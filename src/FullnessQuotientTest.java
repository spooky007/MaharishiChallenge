import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FullnessQuotientTest {

	@Test
	void fullnessQuotientTest() {
		FullnessQuotient quotient = new FullnessQuotient();
		assertEquals(6, quotient.fullnessQuotient(94));
		assertEquals(8, quotient.fullnessQuotient(1));
		assertEquals(5, quotient.fullnessQuotient(9));
		assertEquals(0, quotient.fullnessQuotient(360));
		assertEquals(-1, quotient.fullnessQuotient(-4));

	}

}

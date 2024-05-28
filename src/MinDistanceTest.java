import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinDistanceTest {

	@Test
	void test() {
		MinDistance min = new MinDistance();
		assertEquals(2, min.minDistance(13013));
		assertEquals(1, min.minDistance(8));
	}

}

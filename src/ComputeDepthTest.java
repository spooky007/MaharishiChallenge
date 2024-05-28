import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputeDepthTest {

	@Test
	void computeDepthTest() {
		ComputeDepth depth = new ComputeDepth();
		assertEquals(9, depth.computeDepth(42));
		assertEquals(10, depth.computeDepth(7));
		assertEquals(8, depth.computeDepth(13));
		assertEquals(36, depth.computeDepth(25));
	}
}

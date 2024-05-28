import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VesuvianTest {

	@Test
	void test() {
		Vesuvian vesuvian = new Vesuvian();
		assertEquals(1, vesuvian.isVesuvian(50));
		assertEquals(1, vesuvian.isVesuvian(65));
		assertEquals(1, vesuvian.isVesuvian(85));
		assertEquals(0, vesuvian.isVesuvian(19));
		assertEquals(0, vesuvian.isVesuvian(20));
	}
}

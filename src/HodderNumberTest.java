import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HodderNumberTest {

	@Test
	void test() {
		HodderNumber hodder = new HodderNumber();
		assertEquals(1, hodder.isHodderNumber(3));
		assertEquals(1, hodder.isHodderNumber(7));
		assertEquals(1, hodder.isHodderNumber(31));
		assertEquals(1, hodder.isHodderNumber(127));
		assertEquals(0, hodder.isHodderNumber(51));
		assertEquals(0, hodder.isHodderNumber(57));
	}
}

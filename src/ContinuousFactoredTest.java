import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContinuousFactoredTest {

	@Test
	void test() {
		ContinuousFactored factor = new ContinuousFactored();
		assertEquals(1, factor.isContinuousFactored(6));
		assertEquals(1, factor.isContinuousFactored(60));
		assertEquals(1, factor.isContinuousFactored(120));
		assertEquals(1, factor.isContinuousFactored(90));
		
		assertEquals(0, factor.isContinuousFactored(18));
		assertEquals(0, factor.isContinuousFactored(99));
		assertEquals(0, factor.isContinuousFactored(121));
		assertEquals(0, factor.isContinuousFactored(2));
		assertEquals(0, factor.isContinuousFactored(13));
	}
}

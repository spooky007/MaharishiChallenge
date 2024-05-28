import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StatonMeasureTest {

	@Test
	void statonMeasureTest() {
		StantonMeasure stantonMeasure = new StantonMeasure();
		assertEquals(1, stantonMeasure.stantonMeasure((new int[] { 1 })));
		assertEquals(1, stantonMeasure.stantonMeasure((new int[] { 0 })));
		assertEquals(0, stantonMeasure.stantonMeasure((new int[] { 3, 1, 1, 4 })));
		assertEquals(6, stantonMeasure.stantonMeasure((new int[] { 1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4 })));
		assertEquals(0, stantonMeasure.stantonMeasure((new int[] { })));
	}

}

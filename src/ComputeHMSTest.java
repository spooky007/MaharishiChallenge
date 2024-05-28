import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputeHMSTest {

	@Test
	void test() {
		ComputeHMS hms = new ComputeHMS();
		assertArrayEquals(new int[] { 1, 2, 15 }, hms.computeHMS(3735));
		assertArrayEquals(new int[] { 0, 6, 20 }, hms.computeHMS(380));
		assertArrayEquals(new int[] { 1, 0, 50 }, hms.computeHMS(3650));
		assertArrayEquals(new int[] { 0, 0, 55 }, hms.computeHMS(55));
		assertArrayEquals(new int[] { 0, 0, 0 }, hms.computeHMS(0));
	}
}

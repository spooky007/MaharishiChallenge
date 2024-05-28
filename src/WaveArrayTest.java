import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaveArrayTest {

	@Test
	void test() {
		WaveArray wave = new WaveArray();
		assertEquals(1, wave.isWaveArray(new int[] { 7, 2, 9, 10, 5 }));
		assertEquals(1, wave.isWaveArray(new int[] { 4, 11, 12, 1, 6 }));
		assertEquals(1, wave.isWaveArray(new int[] { 1, 0, 5 }));
		assertEquals(1, wave.isWaveArray(new int[] { 2 }));
		assertEquals(0, wave.isWaveArray(new int[] { 2, 6, 3, 4 }));
	}
}

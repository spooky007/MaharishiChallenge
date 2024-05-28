import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ClusterCompressionTest {

	@Test
	void clusterCompressionTest() {
		ClusterCompression compression = new ClusterCompression();
		assertArrayEquals(new int[] { 0, 2, 0, 2, 0, 2, 0 },
				compression.clusterCompression(new int[] { 0, 0, 0, 2, 0, 2, 0, 2, 0, 0 }));
		assertArrayEquals(new int[] { 18 }, compression.clusterCompression(new int[] { 18 }));
		assertArrayEquals(new int[] {}, compression.clusterCompression(new int[] {}));
		assertArrayEquals(new int[] { -5 }, compression.clusterCompression(new int[] { -5, -5, -5, -5, -5 }));
		assertArrayEquals(new int[] { 1, 2, 1 },
				compression.clusterCompression(new int[] { 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1 }));
		assertArrayEquals(new int[] { 8, 6, -2 }, compression.clusterCompression(new int[] { 8, 8, 6, 6, -2, -2, -2 }));
	}
}

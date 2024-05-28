import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxDisjointTest {

	@Test
	void minMaxDisjointTest() {
		MinMaxDisjoint disjoint = new MinMaxDisjoint();
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 18, -1, 3, 4, 0 }));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 9, 0, 5, 9 }));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 0, 5, 18, 0, 9 }));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 7, 7, 7, 7 }));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] {}));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 1, 2 }));
		assertEquals(0, disjoint.isMinMaxDisjoint(new int[] { 1 }));
		assertEquals(1, disjoint.isMinMaxDisjoint(new int[] { 5, 4, 1, 3, 2 }));

	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuthrieIndexTest {

	@Test
	void guthrieIndexTest() {
		GuthrieIndex guthrieIndex = new GuthrieIndex();
		assertEquals(0, guthrieIndex.guthrieIndex(1));
		assertEquals(1, guthrieIndex.guthrieIndex(2));
		assertEquals(7, guthrieIndex.guthrieIndex(3));
		assertEquals(2, guthrieIndex.guthrieIndex(4));
		assertEquals(8, guthrieIndex.guthrieIndex(42));

	}

}

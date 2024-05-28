import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountRepresentationTest {

	@Test
	void countRepresentationTest() {
		CountRepresentation representation = new CountRepresentation();
		assertEquals(15, representation.countRepresentations(12));
	}

}

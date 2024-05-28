import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MercurialTest {

	@Test
	void test() {
		Mercurial mercurial = new Mercurial();
		assertEquals(0, mercurial.isMercurial(new int[] { 1, 2, 10, 3, 15, 1, 2, 2 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 5, 2, 10, 3, 15, 1, 2, 2 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 1, 2, 10, 3, 15, 16, 2, 2 }));
		assertEquals(0, mercurial.isMercurial(new int[] { 3, 2, 18, 1, 0, 3, -11, 1, 3 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 2, 3, 1, 1, 18 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 8, 2, 1, 1, 18, 3, 5 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 3, 3, 3, 3, 3, 3 }));
		assertEquals(1, mercurial.isMercurial(new int[] { 1 }));
		assertEquals(1, mercurial.isMercurial(new int[] {}));
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void test() {
		Anagram anagram = new Anagram();
		assertEquals(1, anagram.areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 't', 's'}));
		assertEquals(0, anagram.areAnagrams(new char[] {'s', 'i', 't'}, new char[] {'i', 'd', 's'}));
		assertEquals(0, anagram.areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 't'}));
		assertEquals(0, anagram.areAnagrams(new char[] {'b', 'o', 'g'}, new char[] {'b', 'o', 'o'}));
		assertEquals(1, anagram.areAnagrams(new char[] {}, new char[] {}));
		assertEquals(1, anagram.areAnagrams(new char[] {'b', 'i', 'g'}, new char[] {'b', 'i', 'g'}));

	}

}

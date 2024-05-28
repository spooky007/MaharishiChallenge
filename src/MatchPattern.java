
public class MatchPattern {

	 public int matchPattern(int[] a, int len, int[] pattern, int patternLen) {
		// len is the number of elements in the array a, patternLen is the number of
		// elements in the pattern.
		int i = 0; // index into a
		int k = 0; // index into pattern
		int matches = 0; // how many times current pattern character has been matched so far
		for (i = 0; i < len; i++) {
			if (a[i] == pattern[k]) {
				matches++;
			} else if (matches == 0 || k == patternLen - 1) {
				return 0;
			} else {
				k++;
				i--;
				matches = 0;
			}
		}
		if (i == len && k == patternLen - 1) {
			return 1;
		} else {
			return 0;
		}
	}
}

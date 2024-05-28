
public class Anagram {

	public int areAnagrams(char[] a, char[] b) {
		int lenA = a.length;
		int lenB = b.length;
		char[] c = b;
		if (lenA != lenB) {
			return 0;
		} else {
			for (int i = 0; i < lenA; i++) {
				boolean found = false;
				for (int j = 0; j < lenB; j++) {
					if (a[i] == c[j]) {
						c[j] = '-';
						found = true;
						break;
					}
				}
				if (!found) {
					return 0;
				}
			}
		}
		return 1;
	}
}

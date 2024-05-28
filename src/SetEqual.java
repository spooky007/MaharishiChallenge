
public class SetEqual {

	public int isSetEqual(int[] a, int[] b) {
		int len1 = a.length;
		int len2 = b.length;
		for (int i = 0; i < len1; i++) {
			boolean found = false;
			for (int j = 0; j < len2; j++) {
				if (b[j] == a[i]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}
		for (int i = 0; i < len2; i++) {
			boolean found = false;
			for (int j = 0; j < len1; j++) {
				if (a[j] == b[i]) {
					found = true;
					break;
				}
			}
			if (!found) {
				return 0;
			}
		}
		return 1;
	}
}

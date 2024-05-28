
public class AllPossibilities {

	public int isAllPossibilities(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0 ; j < len; j++) {
				if (a[j] == i) {
					found = true;
				}
			}
			if (!found) {
				return 0;
			}
		}
		return 1;
	}
}

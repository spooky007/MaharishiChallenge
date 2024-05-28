
public class HasNValues {
	
	public int hasNValues(int[] a, int n) {
		int len = a.length;
		int[] b = new int[len];
		int j = 0;
		for (int i = 0; i < len; i++) {
			int k = 0;
			boolean found = false;
			while (k <= j) {
				if (a[i] == b[k]) {
					found = true;
					break;
				}
				k++;
			}
			if (!found) {
				b[j++] = a[i];
			}
		}
		if (j == n) {
			return 1;
		}
		return 0;
	}
}

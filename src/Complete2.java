
public class Complete2 {

	public int isComplete(int[] a) {
		int len = a.length;
		int maxEven = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] < 1) {
				return 0;
			}
			if (a[i] % 2 == 0 && a[i] > maxEven) {
				maxEven = a[i];
			}
		}
		for (int i = 2; i < maxEven; i += 2) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
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

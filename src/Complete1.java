
public class Complete1 {

	public int isComplete(int[] a) {
		int len = a.length;
		int evenCount = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0 && a[i] > max) {
				max = a[i];
			}
			if (a[i] % 2 == 0 && a[i] < min) {
				min = a[i];
			}
			if (a[i] % 2 == 0) {
				evenCount++;
			}
		}
		if (min % 2 != 0 || max % 2 != 0 || evenCount < 2 || min == max) {
			return 0;
		}
		for (int j = min; j <= max; j++) {
			boolean found = false;
			for (int k = 0; k < len; k++) {
				if (a[k] == j) {
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

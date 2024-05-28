
public class PairedN {

	public int isPairedN(int[] a, int n) {
		int len = a.length;
		if ((len - 1) + (len - 2) < n || len < 2 || n < 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == n && i + j == n) {
					return 1;
				}
			}
		}
		return 0;
	}
}

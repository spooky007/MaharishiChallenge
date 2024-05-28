
public class OnionArray {

	public int isOnionArray1(int[] a) {
		int len = a.length;
		if (len < 2) {
			return 1;
		}
		for (int j = 0, k = len - 1; j != k && j >= 0 && k >= 0; j++, k--) {
			if (j + k + 1 == len) {
				if (a[j] + a[k] > 10) {
					return 0;
				}
			}
		}
		return 1;
	}

	public int isOnionArray(int[] a) {
		if (a.length == 1 || a.length == 0)
			return 1;

		for (int i = 0, j = a.length - 1; i < j; i++, j--) {
			if (i + j + 1 == a.length) {
				if (a[i] + a[j] > 10)
					return 0;
			}
		}
		return 1;
	}
}

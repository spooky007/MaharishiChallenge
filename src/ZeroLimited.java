
public class ZeroLimited {

	public int isZeroLimited(int[] a) {
		int len = a.length;
		int index = 0;
		for (int i = 0, n = 0; 3 * n + 1 < len; i++) {
			index = 3 * n + 1;
			if (i == index) {
				if (a[i] != 0) {
					return 0;
				}
				n++;
			}
			if (i != index && a[i] == 0) {
				return 0;
			}
		}
		return 1;
	}
}


public class Dual {

	public int isDual(int[] a) {
		int len = a.length;
		if (len % 2 != 0) {
			return 0;
		}
		if (len == 0 || len == 2) {
			return 1;
		}
		int sum = a[0] + a[1];
		for (int i = 2; i < len; i += 2) {
			if (a[i] + a[i + 1] != sum) {
				return 0;
			}
		}
		return 1;
	}
}

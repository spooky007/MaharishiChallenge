public class IntegerBasedRounding {

	public void doIntegerBasedRounding(int[] a, int n) {
		int len = a.length;
		if (n <= 0) {
			return;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] < 0 || a[i] % n == 0) {
				a[i] = a[i];
				continue;
			}
			if (a[i] < n) {
				if (a[i] - 0 < n - a[i]) {
					a[i] = 0;
				} else {
					a[i] = n;
				}
			} else {
				int multiple = (a[i] / n) * n;
				int multiplePlusN = multiple + n;
				if (a[i] - multiple < multiplePlusN - a[i]) {
					a[i] = multiple;
				} else {
					a[i] = multiplePlusN;
				}
			}
		}
	}
}

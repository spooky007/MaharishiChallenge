class DaphneArray {

	public int isDaphneArray(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		if (len == 1) {
			return 1;
		}
		boolean even = a[0] % 2 == 0 ? true : false;
		for (int i = 1; i < len; i++) {
			if (even && a[i] % 2 != 0) {
				return 0;
			}
			if (!even && a[i] % 2 == 0) {
				return 0;
			}
		}
		return 1;
	}
}

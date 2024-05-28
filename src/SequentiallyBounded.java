
public class SequentiallyBounded {

	public int isSequentiallyBounded(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 1;
		}
		int previous = a[0];
		if (previous < 0) {
			return 0;
		}
		int count = 1;
		for (int i = 1; i < len; i++) {
			if (a[i] < previous || a[i] < 0) {
				return 0;
			}
			if (a[i] == previous) {
				count++;
			}
			if (a[i] > previous) {
				if (count < previous) {
					count = 1;
					previous = a[i];
				} else {
					return 0;
				}
			}
		}
		return 1;
	}
}

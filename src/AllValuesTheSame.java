
public class AllValuesTheSame {

	public int allValuesTheSame(int[] a) {
		int len = a.length;
		if (len == 0) {
			return 0;
		}
		int value = a[0];
		for (int i = 1; i < len; i++) {
			if (a[i] != value) {
				return 0;
			}
		}
		return 1;
	}
}

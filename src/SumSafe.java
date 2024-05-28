
public class SumSafe {

	public int isSumSafe(int[] a) {
		int sum = 0;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			sum += a[i];
		}
		for (int i = 0; i < len; i++) {
			if (a[i] == sum) {
				return 0;
			}
		}
		return 1;
	}
}

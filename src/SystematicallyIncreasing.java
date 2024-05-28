
public class SystematicallyIncreasing {

	public int isSystematicallyIncreasing(int[] a) {
		int len = a.length;
		int index = 0;
		for (int i = 1; index < len; i++) {
			int k = 1;
			while (k <= i) {
				if (a[index++] != k) {
					return 0;
				}
				if (index == len - 1 && a[index] != i) {
					return 0;
				}
				k++;
			}
 		}
		return 1;
	}
}

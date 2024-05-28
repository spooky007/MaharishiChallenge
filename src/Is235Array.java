
public class Is235Array {

	public int is235Array(int[] a) {
		int len = a.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
			if (a[i] % 3 == 0) {
				count++;
			}
			if (a[i] % 5 == 0) {
				count++;
			}
			if (a[i] % 2 != 0 && a[i] % 3 != 0 && a[i] % 5 != 0) {
				count++;
			}
		}
		if (count != len) {
			return 0;
		}
		return 1;
	}
}

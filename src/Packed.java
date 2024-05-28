
public class Packed {

	public int isPacked(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] < 1) {
				return 0;
			}
			int count = 0;
			int j = 0;
			while (j < len) {
				if (a[j] == a[i]) {
					count++;
				}
				j++;
			}
			if (count != a[i]) {
				return 0;
			}
		}
		for (int i = 0; i < len;) {
			int count = 0;
			int j = i;
			while (count < a[i]) {
				if (a[j] != a[i]) {
					return 0;
				}
				if (a[j] == a[i]) {
					count++;
				}
				j++;
			}
			i += a[i];
		}
		return 1;
	}
}

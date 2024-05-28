
public class Layered {

	public int isLayered(int[] a) {
		int len = a.length;
		if (len < 2) {
			return 0;
		}
		int previous = a[0];
		int count = 1;
		for (int i = 1; i < len; i++) {
			if (a[i] == previous) {
				count++;
			}
			if (a[i] != previous) {
				if (a[i] - previous != 1 || count < 2) {
					return 0;
				} else {
					previous = a[i];
					count = 0;
				}
			}
		}
		return 1;
	}
}

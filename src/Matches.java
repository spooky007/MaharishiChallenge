
public class Matches {

	public int matches(int[] a, int[] p) {
  		int len1 = p.length;
		boolean positive = true;
		int index = 0;
		int end = 0;
 		for (int i = 0; i < len1; i++) {
			int count = p[i];
			if (p[i] < 0) {
				positive = false;
				count = -1 * p[i];
			}
			if (p[i] > 0) {
				positive = true;
			}
			end += count;
			for (int j = index; j < end; j++) {
				if (positive && a[j] < 0) {
					return 0;
				}
				if (!positive && a[j] > 0) {
					return 0;
				}
			}
			index += count;
		}
		return 1;
	}
}

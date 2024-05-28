
public class Centered {

	public int isCentered(int[] a) {
		int len = a.length;
		if (len % 2 == 0) {
			return 0;
		}
		int middleIndex = len / 2;
		for (int i = 0; i < len; i++) {
			if (i != middleIndex && a[i] <= a[middleIndex]) {
				return 0;
			}
		}
		return 1;
	}
}

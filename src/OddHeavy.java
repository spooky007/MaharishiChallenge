
public class OddHeavy {

	public int isOddHeavy(int[] a) {
		int len = a.length;
		boolean containsOdd = false;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 1) {
				containsOdd = true;
				for (int j = 0; j < len; j++) {
					if (a[j] % 2 == 0 && a[j] > a[i]) {
						return 0;
					}
				}
			}
		}
		if (containsOdd == false) {
			return 0;
		}
		return 1;
	}
}

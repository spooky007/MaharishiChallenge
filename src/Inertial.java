
public class Inertial {

	public static int isInertial(int[] a) {
		int len = a.length;
		int max = 0;
		boolean hasOdd = false;
		for (int i = 0; i < len; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] % 2 == 1) {
				hasOdd = true;
			}
		}
		if (!hasOdd || max % 2 == 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 1) {
				for (int j = 0; j < len; j++) {
					if (a[j] % 2 == 0 && a[j] != max && a[i] <= a[j]) {
						return 0;
					}
				}
			}
		}
		return 1;
	}
}
 
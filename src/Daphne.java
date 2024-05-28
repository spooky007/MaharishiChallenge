
public class Daphne {

	public int isDaphne(int[] a) {
		int len = a.length;
		boolean containsOdd = false;
		int leftEvenCount = 0;
		int rightEvenCount = 0;
		int finalLeftEvenCount = 0;
		int finalRightEvenCount = 0;
		int i, j;
		if (a[0] % 2 != 0 || a[len - 1] % 2 != 0) {
			return 0;
		}
		for ( i = 0, j = len -1; i < len && j != i; i++, j--) {
			if (a[i] % 2 == 0) {
				leftEvenCount++;
			}
			if (a[j] % 2 == 0) {
				rightEvenCount++;
			}
			if (a[i] % 2 != 0) {
				containsOdd = true;
				finalLeftEvenCount = leftEvenCount;
			}
			if (a[j] % 2 != 0) {
				containsOdd = true;
				finalRightEvenCount = rightEvenCount;
			}
		}
		if (!containsOdd || finalRightEvenCount != finalLeftEvenCount) {
			return 0;
		}
		return 1;
	}
}


public class LargestDifferenceOfEvens {
	
	public int largestDifferenceOfEvens(int[] a) {
		int len = a.length;
		int largestDiff = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		if (count < 2) {
			return -1;
		}
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				for (int j = 0; j < len && j != i; j++) {
					if (a[j] % 2 == 0) {
						if (a[i] - a[j] > largestDiff) {
							largestDiff = a[i] - a[j];
						}
					}
				}
			}
		}
		return largestDiff;
	}
}

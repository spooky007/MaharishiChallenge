
public class CountSquarePairs {

	public static int countSquarePairs(int[] a) {
		int len = a.length;
		int perfectSquareCount = 0;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j) {
					continue;
				}
				if (a[i] < a[j] && a[i] > 0 && a[j] > 0) {
					if (isPerfectSquare(a[i] + a[j])) {
						perfectSquareCount++;
					}
				}
			}
		}
		return perfectSquareCount;
	}

	public static boolean isPerfectSquare(int a) {
		boolean isPerfectSquare = false;
		for (int i = 0; i <= a; i++) {
			if (i * i == a) {
				isPerfectSquare = true;
			}
		}
		return isPerfectSquare;
	}
}


public class Hollow {

	public int isHollow1(int[] a) {
		int len = a.length;
		int leftNonZeroes = 0;
		int rightNonZeroes = 0;
		int zeroCount = 0;
		boolean zeroStart = false;
		boolean zeroEnd = false;
		for (int i = 0; i < len; i++) {
			if (a[i] != 0) {
				if (!zeroStart) {
					leftNonZeroes++;
				} 
				if (zeroStart) {
					zeroEnd = true;
					rightNonZeroes++;
				}
			}
			if (a[i] == 0) {
				if (zeroEnd) {
					return 0;
				}
				if (!zeroStart && !zeroEnd) {
					zeroStart = true;
				}
				zeroCount++;
			}
		}
		if (zeroCount < 3 || leftNonZeroes != rightNonZeroes) {
			return 0;
		}
		return 1;
	}
	
	public int isHollow(int[] a) {
		int len = a.length;
		boolean leftStart = false;
		boolean rightStart = false;
		int zeroCount = 0;
		for (int i = 0, j = len -1; i <= j; i++, j--) {
			if (a[i] != 0 && a[j] == 0 || a[i] == 0 && a[j] != 0) {
				return 0;
			}
			if (a[i] == 0) {
				zeroCount++;
				leftStart = true;
			}
			if (a[j] == 0 && i != j) {
				zeroCount++;
				rightStart = true;
			}
			if (rightStart && a[j] != 0) {
				return 0;
			}
			if (leftStart && a[i] != 0) {
				return 0;
			}
		}
		if (zeroCount < 3) {
			return 0;
		}
		return 1;
	}
}

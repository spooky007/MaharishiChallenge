
public class ZeroPlentiful {

	public int isZeroPlentiful(int[] a) {
		int len = a.length;
		boolean containsZero = false;
		boolean start = false;
		int count = 0;
		int seqCount = 0;  // tracks the number of 4-zero sequences
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				containsZero = true;
				start = true;
				count++;
				if (i == len - 1) {
					if (count < 4) {
						return 0;
					} else {
						seqCount++;
					}
				}
			}
			if (a[i] != 0 && start == true) {
				if (count < 4) {
					return 0;
				} else {
					seqCount++;
				}
				count = 0;
				start = false;
			}
		}
		if (!containsZero) {
			return 0;
		}
		return seqCount;
	}
}

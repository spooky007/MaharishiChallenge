
public class RailRoadTie {

	public int isRailRoadTie(int[] a) {
		int len = a.length;
		if (len <= 1) {
			return 0;
		}
		boolean hasNonZero = false;

		for (int i = 0; i < len; i++) {
			if (a[i] != 0) {
				hasNonZero = true;
			}
			if (a[i] == 0) {
				if (i == 0 || i == len - 1) {
					return 0;
				}
				if (a[i + 1] == 0 || a[i -1] == 0) {
					return 0;
				}
			}
			if (a[i] != 0) {
				if (i == 0 && a[i + 1] == 0) {
					return 0;
				}
				if (i == len - 1 && a[i - 1] == 0) {
					return 0;
				}
				if (i != len - 1 && i != 0) {
					if (a[i - 1] == 0 && a[i + 1] == 0) {
						return 0;
					}
					if (a[i - 1] != 0 && a[i + 1] != 0) {
						return 0;
					} 
				}
			}
		}
		if (hasNonZero) {
			return 1;
		}
		return 0;
	}
}

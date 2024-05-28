
public class MinMaxDisjoint {

	public int isMinMaxDisjoint(int[] a) {
 		int len = a.length;
		if (len < 3) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxCount = 0;
		int minCount = 0;
		int minPos = 0;
		int maxPos = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] > max) {
				max = a[i];
				maxPos = i;
				maxCount = 0;
			}
			if (a[i] < min) {
				min = a[i];
				minPos = i;
				minCount = 0;
			}
			if (a[i] == max) {
				maxCount++;
			}
			if (a[i] == min) {
				minCount++;
			}
			if (i == len - 1) {
				if (maxCount > 1 || minCount > 1) {
					return 0;
				}
			}
		}
		if (minPos - maxPos == 1 || minPos - maxPos == -1 || min == max) {
			return 0;
		}
		return 1;
	}
}

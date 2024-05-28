
public class Centered15 {

	public int isCentered15(int[] a) {
		int len = a.length;
		int start = 0;
		int end = 0;
		int isCentered = 0;
		for (int i = 0; i < len; i++) {
			int index = i;
			int sum = 0;
			while (sum < 15 && index < len) {
				sum += a[index];
				index++;
			}
			if (sum > 15) {
				continue;
			}
			if (sum == 15) {
				start = i;
				end = index - 1;
				if (len - 1 - end == start) {
					isCentered = 1;
					break;
				} else {
					continue;
				}
			}
		}
		return isCentered;
	}
}

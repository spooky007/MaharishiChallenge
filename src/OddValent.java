
public class OddValent {

	public int isOddValent(int[] a) {
		int len = a.length;
		boolean oddFlag = false;
		boolean multiOccurFlag = false;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 1) {
				oddFlag = true;
			}
			int j = i + 1;
			while (j < len) {
				if (a[j] == a[i]) {
					multiOccurFlag = true;
				}
				j++;
			}
			if (oddFlag && multiOccurFlag) {
				return 1;
			}
		}
		return 0;
	}
}

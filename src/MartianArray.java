
public class MartianArray {

	public int isMartian(int[] a) {
		int len = a.length;
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				count1++;
			}
			if (a[i] == 2) {
				count2++;
			}
			if ( i != len - 1 && a[i] == a[i + 1]) {
				return 0;
			}
		}
		if (count1 <= count2) {
			return 0;
		}
		return 1;
	}
}

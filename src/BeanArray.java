
public class BeanArray {

	public int isBeanArray(int[] a) {
		int len = a.length;
		boolean contains9 = false;
		boolean contains13 = false;
		boolean contains7 = false;
		boolean contains16 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				contains9 = true;
			}
			if (a[i] == 13) {
				contains13 = true;
			}
			if (a[i] == 7) {
				if (contains16) {
					return 0;
				}
				contains7 = true;
			}
			if (a[i] == 16) {
				if (contains7) {
					return 0;
				}
				contains16 = true;
			}
		}
		if (contains9 && !contains13) {
			return 0;
		}
		return 1;
	}
}

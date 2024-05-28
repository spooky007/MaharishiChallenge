
public class Filter {

	public int isFilter(int[] a) {
		int len = a.length;
		boolean contains9 = false;
		boolean  contains11 = false;
		boolean contains7 = false;
		boolean  contains13 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 9) {
				contains9 = true;
			}
			if (a[i] == 11) {
				contains11 = true;
			}
			if (a[i] == 7) {
				contains7 = true;
				if (contains13) {
					return 0;
				}
			}
			if (a[i] == 13) {
				contains13 = true;
				if (contains7) {
					return 0;
				}
			}
		}
		if (contains9 && !contains11) {
			return 0;
		}
		return 1;
	}
}

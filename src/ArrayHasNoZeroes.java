
public class ArrayHasNoZeroes {

	public int arrayHasNoZeroes(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				return 0;
			}
		}
		return 1;
	}
}

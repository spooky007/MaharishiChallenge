
public class Balanced1 {

	public int isBalanced(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0 && a[i] % 2 != 0) {
				return 0;
			}
			if (i % 2 == 1 && a[i] % 2 != 1) {
				return 0;
			}
		}
		return 1;
	}
}

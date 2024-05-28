
public class Balanced {

	public int isBalanced(int[] a) {
		int len = a.length;
		if (len % 2 == 1) {
			return 0;
		}
		for (int i = 0; i < len; i++) {
			boolean found = false;
			for (int j = 0; j < len; j++) {
				if (a[j] == -a[i]) {
					found = true;
				}
			}
			if (!found) {
				return 0;
			}
		}
		return 1;
	}
}

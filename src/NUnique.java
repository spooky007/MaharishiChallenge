 
public class NUnique {

	public int isNUnique(int[] a, int n) {
		int len = a.length;
		if (len == 1) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == n) {
					count++;
				}
			}
		}
		if (count > 1 || count == 0) {
			return 0;
		}
		return 1;
	}
}

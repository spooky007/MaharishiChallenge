
public class CubePerfect {

	public int isCubePerfect(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (!isCube(a[i])) {
				return 0;
			}
		}
		return 1;
	}
	
	public boolean isCube(int n) {
		int num = n < 0 ? -n : n;
		for (int i = 0; i <= num; i++) {
			int cube = i * i * i;
			if (cube == n || cube * -1 == n) {
				return true;
			}
		}
		return false;
	}
}

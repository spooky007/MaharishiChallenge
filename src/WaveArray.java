
public class WaveArray {

	public int isWaveArray(int[] a) {
		int len = a.length;
		boolean flag1 = a[0] % 2 == 0 ? true : false;
		for (int i = 1; i < len; i++) {
			boolean flag2 = a[i] % 2 == 0 ? true : false;
			if (flag2 == flag1) {
				return 0;
			}
			flag1 = flag2;
		}
		return 1;
	}
}

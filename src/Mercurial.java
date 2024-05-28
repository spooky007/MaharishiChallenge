
public class Mercurial {

	public int isMercurial(int[] a) {
		int len = a.length;
		boolean leftOne = false;
		boolean found3 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				if (found3) {
					return 0;
				}
				leftOne = true;
			}
			if (a[i] == 3 && leftOne) {
				found3 = true;
			}
		}
		return 1;
	}
}

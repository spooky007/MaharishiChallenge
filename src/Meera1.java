
public class Meera1 {

	public int isMeera(int[] a) {
		int len = a.length;
		boolean contains1 = false;
		boolean contains9 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				contains1 = true;
			}
			if (a[i] == 9) {
				contains9 = true;
			}
		}
		if (!contains9 && contains1 || contains9 && !contains1) {
			return 0;
		}
		return 1;
	}
}
 
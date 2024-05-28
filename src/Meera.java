
public class Meera {

	public int isMeera(int[] a) {
		int len = a.length;
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] >= i) {
				return 0;
			}
			sum  += a[i];
		}
		if (sum != 0) {
			return 0;
		}
		return 1; 
	}
}

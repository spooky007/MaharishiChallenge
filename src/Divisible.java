
public class Divisible {

	public int isDivisible(int[] a, int divisor) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] % divisor != 0) {
				return 0;
			}
		}
		return 1;
	}
}

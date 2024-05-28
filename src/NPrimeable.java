
public class NPrimeable {

	public int isNPrimeable(int[] a, int n) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (!isPrime(a[i] + n)) {
				return 0;
			}
		}
		return 1;
	}
	
	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}


public class BunkerArray {

	public int isBunkerArray(int[] a) {
		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
			if (a[i] % 2 != 0 && isPrime(a[i + 1])) {
				return 1;
			}
		}
		return 0;
	}
	
	public boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}

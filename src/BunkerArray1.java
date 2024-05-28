
public class BunkerArray1 {

	public int isBunkerArray1(int[] a) {
		int len = a.length;
		boolean contains1 = false;
		boolean containsPrime = false;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				containsPrime = true;
				if (contains1) {
					return 1;
				}
			}
			if (a[i] == 1) {
				contains1 = true;
				if (containsPrime) {
					return 1;
				}
			}
		}
		if (contains1 && !containsPrime || !contains1 && containsPrime) {
			return 0;
		}
		return 1;
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

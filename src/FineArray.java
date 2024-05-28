
public class FineArray {

	public int isFineArray(int[] a) {
		int len = a.length;
		int countPrimes = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				countPrimes++;
				boolean found = false;
				for (int j = 0; j < len; j++) {
					if ((isPrime(a[i] + 2)) && a[j] == a[i] + 2 || isPrime(a[i] - 2) && (a[j] == a[i] - 2)) {
						found = true;
					}
				}
				if (!found) {
					return 0;
				}
			}
		}
		if (countPrimes == 0) {
			return 1;
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

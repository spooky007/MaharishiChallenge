
public class MeeraArray1 {

	public int isMeera(int[] a) {
		int len = a.length;
		boolean containsZero = false;
		boolean containsPrime = false;
		for (int i = 0; i < len; i++) {
			if (a[i] == 0) {
				containsZero = true;
			}
			if (isPrime(a[i])) {
				containsPrime = true;
			}
		}
		if (!containsZero && containsPrime || containsZero && !containsPrime) {
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

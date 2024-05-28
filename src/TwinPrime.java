
public class TwinPrime {

	public int isTwinPrime(int n) {
		if (!isPrime(n)) {
			return 0;
		}
		int lower = n - 2;
		int upper = n + 2;
		if (isPrime(lower) || isPrime(upper)) {
			return 1;
		}
		return 0;
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

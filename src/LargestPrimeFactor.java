
public class LargestPrimeFactor {
	public int largestPrimeFactor(int n) {
		if (n <= 1) {
			return 0;
		}
		int largestPrime = 0;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
				largestPrime = i;
			}
		}
		return largestPrime;
	}
	
	public boolean isPrime(int a) {
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				return false;
			}
		}
		return true;
	}
}


public class FactorialPrime {

	public int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int result = 1;
		while (n > 0) {
			result *= n;
			n--;
		}
		return result;
	}
	
	public boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int isFactorialPrime(int n) {
		if (isPrime(n)) {
			for (int i = 0; i < n; i++) {
				if (factorial(i) + 1 == n) {
					return 1;
				}
			}
		}
		return 0;
	}
}

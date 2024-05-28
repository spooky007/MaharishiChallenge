
public class PrimeHappy {

	public int isPrimeHappy(int n) {
		int sum = 0;
		if (n < 3) {
			return 0;
		}
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		if (sum % n == 0) {
			return 1;
		}
		return 0;
	}
	
	public boolean isPrime(int a) {
		int i = 2;
		while (i < a) {
			if (a % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
}

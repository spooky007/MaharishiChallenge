
public class EncodeNumber {

	public int[] encodeNumber(int n) {
		if (n <= 1) {
			return null;
		}
		int count = 0;
		int num = n;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
				while (num % i == 0) {
					if (num % i == 0) {
						count++;
					}
					num /= i;
				}
			}
		}
		int[] primes = new int[count];
		int k = 0;
		num = n;
		for (int i = 2; i <= n; i++) {
			if (n % i == 0 && isPrime(i)) {
				while (num % i == 0) {
					if (num % i == 0) {
						primes[k++] = i;
					}
					num /= i;
				}
			}
		}
		return primes;
		
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

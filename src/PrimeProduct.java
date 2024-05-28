
public class PrimeProduct {

	public int isPrimeProduct(int n) {
		for (int i = 0; i < n; i++) {
			if (isPrime(i)) {
				for (int k = i; k < n; k++) {
					if (i * k == n) {
						return 1;
					}
				}
			}
		}
		return 0;
	}
	
	public boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	} 
}

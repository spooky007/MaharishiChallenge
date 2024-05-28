
public class HodderNumber {

	public boolean isPrime(int n) {
		int i = 2;
		while (i < n) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	
	public int power(int a, int b) {
		int result = 1;
		while (b > 0) {
			result *= a;
			b--;
		}
		return result;
	}
	
	public int isHodderNumber(int n) {
		if (isPrime(n) == false) {
			return 0;
		}
		int sum = 0;
		for (int j = 0; sum < n; j++) {
			sum = power(2, j) - 1;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}


public class NiceArray1 {

	public int isNiceArray(int[] a) {
		int len = a.length;
		int primeSum = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				primeSum += a[i];
			}
		}
		if (a[0] != primeSum) {
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

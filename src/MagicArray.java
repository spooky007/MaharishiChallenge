
public class MagicArray {

	public int isMagicArray(int[] a) {
		int len = a.length;
		int first = a[0];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				sum += a[i];
			}
		}
		if (first == sum) {
			return 1;
		}
		return 0;
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

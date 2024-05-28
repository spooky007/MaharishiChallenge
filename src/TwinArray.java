
public class TwinArray {

	public int isTwin(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (isPrime(a[i])) {
				int upper = isPrime(a[i] + 2) ? a[i] + 2 : -1;
				int lower = isPrime(a[i] - 2) ? a[i] - 2 : -1;
				if (upper == -1 && lower == -1) {
					continue;
				}
				boolean found = false;
				for (int j = 0; j < len; j++) {
					if (upper != -1 && a[j] == upper || lower != -1 && a[j] == lower) {
						found = true;
					}
				}
				if (!found) {
					return 0;
				}
			}
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

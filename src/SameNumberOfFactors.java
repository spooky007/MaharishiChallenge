
public class SameNumberOfFactors {

	public int sameNumberOfFactors(int a, int b) {
		if (a < 0 || b < 0) {
			return -1;
		}
		if (a == b) {
			return 1;
		}
		int y = numberOfFactors(a);
		int z = numberOfFactors(b);
		if (y == z) {
			return 1;
		}
		return 0;
		
	}
	
	public int numberOfFactors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}
}

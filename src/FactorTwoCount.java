
public class FactorTwoCount {
	
	public int factorTwoCount(int n) {
		int count = 0;
		while (n % 2 == 0) {
			if (n % 2 == 0) {
				count++;
			}
			n /= 2;
		}
		return count;
	}
}

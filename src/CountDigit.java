
public class CountDigit {

	public int countDigit(int n, int digit) {
		if (n < 0 || digit < 0) {
			return -1;
		}
		int count = 0;
		while (n != 0) {
			int remainder = n % 10;
			if (remainder == digit) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
}


public class SumDigits {

	public int sumDigits(int n) {
		int sum = 0;
		n = n < 0 ? -n : n;
		while (n != 0) {
			int remainder = n % 10;
			sum += remainder;
			n /= 10;
		}
		return sum;
	}
}

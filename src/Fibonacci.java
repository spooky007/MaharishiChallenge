
public class Fibonacci {

	public int isFibonacci(int n) {
		int previous = 1;
		int current = 1;
		int sum = 0;
		if (n == 1) {
			return 1;
		}
		while (sum < n) {
			sum = previous + current;
			previous = current;
			current = sum;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
 	}
}

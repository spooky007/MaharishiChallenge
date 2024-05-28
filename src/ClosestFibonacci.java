
public class ClosestFibonacci {

	public int isClosestFibonacci(int n) {
		int previous = 1;
		int current = 1;
		int fibo = 0;
		if (n < 1) {
			return 0;
		}
		while (fibo < n) {
			fibo = current + previous;
			previous = current;
			current = fibo;
		}
		if (fibo <= n) {
			return fibo;
		}
		return previous;
	}
}

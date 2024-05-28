
public class Fancy {

	public int isFancy(int n) {
		int previous = 1;
		int current = 1;
		int sum = 0;
		while (sum < n) {
			sum = (3 * current) + (2 * previous);
			previous = current;
			current = sum;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}

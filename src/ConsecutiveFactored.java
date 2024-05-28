
public class ConsecutiveFactored {

	public int isConsecutiveFactored(int n) {
		int previous = 1;
		int current = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				previous = current;
				current = i;
			}
			if (previous > 1 && current > 1 && current == previous + 1) {
				return 1;
			}
		}
		return 0;
	}
}

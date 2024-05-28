
public class MinDistance {

	public int minDistance(int n) {
		int minDistance = Integer.MAX_VALUE;
		int previous = 1;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				if (i - previous < minDistance) {
					minDistance = i - previous;
				}
				previous = i;
			}
		}
		return minDistance;
	}
}

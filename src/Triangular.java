
public class Triangular {

	public int isTriangular(int n) {
		int sum = 1;
		int i = 1;
		while (sum < n) {
			sum += ++i;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}

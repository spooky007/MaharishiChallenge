
public class ContinuousFactored {

	public int isContinuousFactored(int n) {
		for (int i = 2; i < n; i++) {
			int sum = 1;
			int k = i;
			while (sum < n) {
				sum *= k;
				k++;
			}
			if (sum == n) {
				return 1;
			}
		}
		return 0;
	}
}

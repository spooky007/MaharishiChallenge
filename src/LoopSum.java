
public class LoopSum {

	public int loopSum(int[] a, int n) {
		int len = a.length;
		int j = 1;
		int sum = 0;
		for (int i = 0; j <= n ; i++) {
			sum += a[i];
			if (i == len - 1) {
				i = -1;
			}
			j++;
		}
		return sum;
	}
}

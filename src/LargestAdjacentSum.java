
public class LargestAdjacentSum {

	public int largestAdjacentSum(int[] a) {
		int len = a.length;
		int largestSum = 0;
		for (int i = 0; i < len - 1; i++) {
			if (a[i] + a[i + 1] > largestSum) {
				largestSum = a[i] + a[i + 1];
			}
		}
		return largestSum;
	}
}

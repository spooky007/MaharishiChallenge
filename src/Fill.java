
public class Fill {

	public int[] fill(int[] arr, int k, int n) {
		if (k < 1 || n < 1) {
			return null;
		}
		int[] arr2 = new int[n];
		int j = 0;
		for (int i = 0; i < n; i++) {
			arr2[i] = arr[j++];
			if (j == k) {
				j = 0;
			}
		}
		return arr2;
	}
}

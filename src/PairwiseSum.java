
public class PairwiseSum {

	public int[] pairwiseSum(int[] a) {
		int len = a.length;
		if (len == 0 || len % 2 == 1) {
			return null;
		}
		int newLen = len / 2;
		int[] newArray = new int[newLen];
		int k = 0;
		for (int i = 0; i < len; i += 2) {
			newArray[k++] = a[i] + a[i + 1];
		}
		return newArray;
	}
}

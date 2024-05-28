
public class NUpcount {

	public static int nUpcount(int n, int[] a) {
		int len = a.length;
		int partialSum = 0;
		int previousSum = 0;
		int count = 0;
		for(int i = 0; i < len; i++) {
			partialSum = previousSum + a[i];
			if (partialSum > n && previousSum <= 5) {
				count++;
			}
			previousSum = partialSum;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr = {2, 3, 1, -6, 8, -3, -1, 2};
		System.out.println(nUpcount(5, arr));
	}
}
 
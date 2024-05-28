
public class DecodeArray {

	public int decodeArray(int[] a) {
		int len = a.length;
		boolean positive = a[0] >= 0 ? true : false;
		int sum = 0;
		for (int i = 0; i < len - 1; i++) {
			int sub = a[i] - a[i + 1];
			int absSub = sub < 0 ? -sub : sub;
			sum += absSub * power(10, len - i - 2);
		}
		if (positive) {
			return sum;
		}
		return -sum;
	}
	
	public int power(int a, int b) {
		int sum = 1;
		while (b > 0) {
			sum *= a;
			b--;
		}
		return sum;
	}
}

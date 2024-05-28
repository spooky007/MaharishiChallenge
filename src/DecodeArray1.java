
public class DecodeArray1 {

	public int decodeArray(int[] a) {
		int len = a.length;
		boolean positive = true;
		int start = 0;
		if (a[0] == -1) {
			positive = false;
			start = 1;
		}
		int count = 0;
		int length = 0;
		for (int i = start; i < len; i++) {
			if (a[i] == 1) {
				length++;
			}
		}
		int result = 0;
		for (int i = start; i < len; i++) {
			if (a[i] == 0) {
				count++;
			}
			if (a[i] == 1) {
				int size = length;
				int coeff = 1;
				while (size > 1) {
					coeff *= 10; 
					size--;
				}
				result += count * coeff;
				count = 0;
				length--;
			}
		}
		if (positive) {
			return result;
		}
		return -result;
	}
}

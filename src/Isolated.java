import java.util.Arrays;

public class Isolated {

	public int isIsolated(long n) {
		if (n > 2097152 || n < 1) {
			return -1;
		}
		long[] square = convertToArray(n * n);
		long[] cube = convertToArray(n * n * n);
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < cube.length; j++) {
				if (square[i] == cube[j]) {
					return 0;
				}
			}
		}
		return 1;
	}

	public long[] convertToArray(long n) {
		int len = 0;
		long num = n;
		while (num != 0) {
			long remainder = num % 10;
			num /= 10;
			len++;
		}
		long[] numArray = new long[len];
		for (int i = 0; i < len; i++) {
			long remainder = n % 10;
			numArray[i] = remainder;
			n /= 10;
		}
		return numArray;
	}
}

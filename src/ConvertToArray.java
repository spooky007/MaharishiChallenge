
public class ConvertToArray {

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

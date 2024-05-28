
public class EncodeArray {

	public int[] encodeArray1(int n) {
		int len = 0;
		boolean negative = n < 0 ? true : false;
		int num = n < 0 ? -n : n;
		if (num == 0) {
			return new int[] { 1 };
		}
		while (num != 0) {
			int remainder = num % 10;
			len += remainder + 1;
			num /= 10;
		}
		int[] digits = new int[len];
		int i = len - 1;
		num = n;
		while (num != 0) {
			int remainder = num % 10;
			int length = remainder;
			digits[i--] = 1;
			while (length > 0) {
				digits[i--] = 0;  // fills array in reverse order since remainder gives the last digit
				length--;
			}
			num /= 10;
		}
		if (negative == true) {
			int k = 0;
			int[] finalArray = new int[len + 1];
			finalArray[0] = -1;
			for (int j = 1; j < len + 1; j++) {
				finalArray[j] = digits[k++];
			}
			return finalArray;
		}
		return digits;
	}

	public int[] encodeArray(int n) {
		boolean negative = n < 0 ? true : false;
		if (n == 0) {
			return new int[] { 1 };
		}
		int len = 0;
		int finalLength = 0;
		n = n < 0 ? -n : n;
		int num = n;
		while (num != 0) {
			len++;
			int remainder = num % 10;
			while (remainder > 0) {
				finalLength++; // tracks the number of zeroes
				remainder--;
			}
			finalLength++; // tracks the extra 1 at the end of the zeroes
			num /= 10;
		}
		int[] temp = new int[len];
		num = n;
		int i = 0;
		while (num != 0) {
			int remainder = num % 10;
			temp[i++] = remainder;
			num /= 10;
		}
		int[] finalArray = new int[finalLength];
		int j = 0;
		for (int k = len - 1; k >= 0; k--) {
			int size = temp[k];
			while (size > 0) {
				finalArray[j++] = 0;
				size--;
			}
			finalArray[j++] = 1;
		}
		if (!negative) {
			return finalArray;
		} else {
			int[] newArray = new int[finalLength + 1];
			newArray[0] = -1;
			i = 0;
			for (int m = 1; m < finalLength + 1; m++) {
				newArray[m] = finalArray[i++];
			}
			return newArray;
		}
	}
}

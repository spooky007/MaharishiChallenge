
public class ConvertToBase10 {

	public int isLegalNumber(int[] a, int base) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			if (a[i] >= base) {
				return 0;
			}
		}
		return 1;
	}

	public int convertToBase10(int[] a, int base) {
		int sum = 0;
		if (isLegalNumber(a, base) == 1) {
			int len = a.length;
//			for (int i = len - 1, j = 0; j <= base && i > 0; i--, j++) {
//				sum += a[i] * power(base, j);
//			}
			int subscript = len - 1;
			for (int i = 0; i < len; i++) {
				sum += a[i] * power(base, subscript);
				subscript--;
			}
		} else {
			return 0;
		}
		return sum;
	}

	public static int power(int a, int b) {
		int result = 1;
		if (b == 0) {
			return 1;
		}
		while (b > 0) {
			result *= a;
			b--;
		}
		return result;
	}

//	public static void main(String[] args) {
//		System.out.println(power(3, 0));
//	}
}

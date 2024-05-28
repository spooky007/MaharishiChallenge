
public class MadhavArray {

	public static int isMadhavArray(int[] a) {
		int len = a.length;
		if (!isMadhavLength(len)) {
			return 0;
		}
		int sum = a[0];
		int count = 2;
		for (int i = 1; i < len; ) {
			int newSum = 0;
			int counter = count;
			while (counter >= 1) {
				newSum += a[i];
				i++;
				counter--;
			}
			if (newSum != sum) {
				return 0;
			}
			count++;
		}
		return 1;
	}

	public static boolean isMadhavLength(int len) {
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum = (i * (i + 1)) / 2;
			if (sum == len) {
				return true;
			} else if (sum > len) {
				return false;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isMadhavArray(new int[] { 2, 1, 1 }));
		System.out.println(isMadhavArray(new int[] { 2, 1, 1, 4, -1, -1 }));
		System.out.println(isMadhavArray(new int[] { 6, 2, 4, 2, 2, 2, 1, 5, 0, 0 }));
		System.out.println(isMadhavArray(new int[] { 18, 9, 10, 6, 6, 6 }));
		System.out.println(isMadhavArray(new int[] { -6, -3, -3, 8, -5, -4 }));
		System.out.println(isMadhavArray(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1 }));
		System.out.println(isMadhavArray(new int[] { 3, 1, 2, 3, 0 }));

	}
}

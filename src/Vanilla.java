
public class Vanilla {

	public int isVanilla(int[] a) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int num = a[i];
			int remainder = a[i] % 10;
			while (num != 0) {
				int newRemainder = num % 10;
				if (newRemainder != remainder) {
					return 0;
				}
				num /= 10;
			}
		}
		return 1;
	}
}


public class RepsEqual {

	public int repsEqual(int[] a, int n) {
		int len = a.length;
		int number = 0;
		int coeff = len;
		for (int i = 0; i < len; i++) {
			number += a[i] * power(10, coeff - 1);
			coeff--;
		}
		if (number == n) {
			return 1;
		}
		return 0;
	}

	public int power(int a, int b) {
		int power = 1;
		while (b > 0) {
			power *= a;
			b--;
		}
		return power;
	}
	
}

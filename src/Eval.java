
public class Eval {
	
	public double eval(double x, int[] a) {
		int len = a.length;
		int j = 0;
		double sum = 0;
		for (int i = 0; i < len; i++) {
			sum += a[i] * power((int)x, j++);
		}
		return sum;
	}

	public int power(int a, int b) {
		int result = 1;
		while (b > 0) {
			result *= a;
			b--;
		}
		return result;
	}
}

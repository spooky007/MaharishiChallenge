
public class GetExponent {

	public int getExponent(int n, int p) {
		if (p <= 1) {
			return -1; 
		}
		int quotient = p;
		int num = n < 0 ? -n : n;
		int i = 0;
		int exponent = 0;
		while (quotient <= num) {
			quotient = power(p, i);
			if (num % quotient == 0) {
				exponent = i;
			}
			i++;
		}
		return exponent;
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

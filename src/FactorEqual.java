
public class FactorEqual {

	public int isFactorEqual(int a, int b) {
		int len = a >= b ? a : b;
		int aFactors = 0;
		int bFactors = 0;
		for (int i = 1; i <= len; i++) {
			if (a % i == 0) {
				aFactors++;
			}
			if (b % i == 0) {
				bFactors++;
			}
		}
		if (aFactors == bFactors) {
			return 1;
		}
		return 0;
	}
}

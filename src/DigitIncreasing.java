
public class DigitIncreasing {

	public int isDigitIncreasing(int a) {
		int sum = 0;
		for (int i = 2; i < 9; i++) {
			if (i == a) {
				return 1;
			}
			sum = i;
			int j = 2;
			while (sum < a) {
				sum += replicate(i, j++);
			}
			if (sum == a) {
				return 1;
			}
		}
		return 0;	
	}
	
	public static int replicate(int a, int b) {
		int result = 0;
		int k = 0;
		while (k < b) {
			result += a * power(10, k++);
		}
		return result;
	}
	
	public static int power(int a, int b) {
		int result = 1;
		while (b > 0) {
			result *= a;
			b--;
		}
		return result;
	}
}

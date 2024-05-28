
public class CheckConcatenatedSum {

	public int checkConcatenatedSum(int n, int catlen) {
		int num = n;
		int sum = 0;
		while (num != 0) {
			int remainder = num % 10;
			sum += concatenate(remainder, catlen);
			num /= 10;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
	
	public static int concatenate(int a, int b) {
		int result = 0;
		int i = 0;
		while (b > 0) {
			result += a * power(10, i);
			i++;
			b--;
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

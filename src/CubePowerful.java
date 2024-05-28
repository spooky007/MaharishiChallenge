
public class CubePowerful {

	public int isCubePowerful(int n) {
		int sum = 0;
		int num = n;
		if (n <= 0) {
			return 0;
		}
		while (num != 0) {
			int remainder = num % 10;
			sum += power(remainder, 3);
			num /= 10;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
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

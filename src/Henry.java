
public class Henry {
	
	public static void main(String[] args) {
		System.out.println(henry(1, 3));
	}

	public static int henry(int i, int j) {
		int sum = 0;
		int count = 0;
		boolean firstArgCounted = false;
		for (int k = 1; ; k++) {
			if (isPerfectNumber(k)) {
				count++;
				if (count == i && !firstArgCounted) {
					sum += k;
					firstArgCounted = true;
				}
				if (count == j) {
					sum += k;
					break;
				}
			}
		} 
		return sum;
	}
	
	public static boolean isPerfectNumber(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
}

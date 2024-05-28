
public class FullnessQuotient {

	public int fullnessQuotient(int n) {
		if ( n < 1) {
			return -1;
		}
		int count = 0;
		for (int i = 2; i <= 9; i++) {
			int num = n;
			boolean containsZero = false;
			while (num != 0) {
				int remainder = num % i;
				if (remainder == 0) {
					containsZero = true;
					break;
				}
				num /= i;
			}
			if (!containsZero) {
				count++;
			}
		}
		return count;
	}
}
  

public class Complete {

	public int isComplete(int[] a) {
		int len = a.length;
		boolean containsEven = false;
		boolean containsPerfectSquare = false;
		boolean sumTo8 = false;
		for (int i = 0; i < len; i++) {
			if (a[i] % 2 == 0) {
				containsEven = true;
			}
			if (isSquare(a[i]) == 1) {
				containsPerfectSquare = true;
			}
			for (int j = i + 1; j < len; j++) {
				if (a[i] + a[j] == 8) {
					sumTo8 = true;
				}
			}
			if (containsEven && containsPerfectSquare && sumTo8) {
				return 1;
			}
		}
		return 0;
	}
	
	public int isSquare(int n) {
		int i = 0;
		while (i <= n) {
			if (i * i == n) {
				return 1;
			}
			i++;
		}
		return 0;
	}
}

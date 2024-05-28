
public class OneBalanced {

	public int isOneBalanced(int[] a) {
		int len = a.length;
		boolean leftNonOne = false;
		boolean rightNonOne = false;
		int countOnes = 0;
		int countNonOnes = 0;
		for (int i = 0, j = len - 1; i <= j; i++, j--) {
			if (a[i] != 1) {
				leftNonOne = true;
				countNonOnes++;
			}
			if (a[j] != 1) {
				rightNonOne = true;
				countNonOnes++;
			}
			if (a[i] == 1) {
				countOnes++;
			}
			if (a[j] == 1 && j != i) {
				countOnes++;
			}
			if (leftNonOne && a[i] == 1) {
				return 0;
			}
			if (rightNonOne && a[j] == 1) {
				return 0;
			}
		}
		if (countOnes != countNonOnes) {
			return 0;
		}
		return 1;
	}
}

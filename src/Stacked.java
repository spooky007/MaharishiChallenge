
public class Stacked {

	public int isStacked(int n) {
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum += i;
			i++;
		}
		if (sum != n) {
			return 0;
		}
		return 1;
	}
}

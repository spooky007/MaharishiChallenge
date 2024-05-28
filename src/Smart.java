
public class Smart {
	
	public int isSmart(int n) {
		int previous = 1;
		int i = 1;
		int sum = 0;
		while (sum < n) {
			sum = previous + i;
			previous = sum;
			i++;
		}
		if (sum == n) {
			return 1;
		}
		return 0;
	}
}


public class Vesuvian {

	public int isVesuvian(int n) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				sum = (i * i) + (j * j);
				if (sum == n) {
					count++;
					break;
				}
			}
		}
		if (count > 2) {
			return 1;
		}
		return 0;
	}
}

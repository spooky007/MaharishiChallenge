
public class CountOnes {

	public int countOnes(int n) {
		int count1 = 0;
		while (n != 0) {
			int remainder = n % 2;
			if (remainder == 1) {
				count1++;
			}
			n /= 2;
		}
		return count1;
	}
}

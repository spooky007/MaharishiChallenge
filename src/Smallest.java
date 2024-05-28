
public class Smallest {

	public int smallest(int n) {
		int smallestNum = 0;
		int count = 0;
		boolean found = false;
		int i = 0;
		while (!found) {
			int num = 1;
			count = 0;
			while (num <= n) {
				if (hasTwo(i * num) == false) {
					break;
				} else {
					count++;
				}
				num++;
			}
			if (count == n) {
				smallestNum = i;
				found = true;
			}
			i++;
		}
		return smallestNum;
	}
	
	public boolean hasTwo(int n) {
		int num = n;
		while (num != 0) {
			int remainder = num % 10;
			if (remainder == 2) {
				return true;
			}
			num /= 10;
		}
		return false;
	}
}

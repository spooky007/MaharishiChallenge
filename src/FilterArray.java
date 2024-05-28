
public class FilterArray {

	public int[] filterArray(int[] a, int n) {
		int len = a.length;
		int count = 0;
		int num = n;
		while (num != 0) {
			int remainder = num % 2;
			if (remainder == 1) {
				count++;
			}
			num /= 2;
		}
		int[] digits = new int[count]; 
		num = n;
		int i = 0;
		int k = 0;
		while(num != 0) {
			int remainder = num % 2;
			if (remainder == 1) {
				digits[k++] = i;
			}
			num /= 2;
			i++;
		}
		int[] results = new int[count];
		for (i = 0; i < results.length; i++) {
			if (digits[i] >= len) {
				return null;
			}
			results[i] = a[digits[i]];
		}
		return results;
	}
}

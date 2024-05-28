import java.util.Arrays;

public class Trivalent {

	public int isTrivalent(int[] a) {
		int len = a.length;
		if (len < 3) {
			return 0; 
		}
		int[] triArray = new int[len];
		triArray[0] = a[0];
		int count = 1;
		int k = 1;
		for (int i = 1; i < len; i++) {
			boolean exists = false;
			for (int j = 0; j < count; j++) {
				if (a[i] == triArray[j]) {
					exists = true;
					break;
				}
			}
			if (!exists) {
				triArray[k++] = a[i];
				count++;
			}
			if (count > 3) {
				return 0;
			}
		}
		if (count < 3) {
			return 0;
		}
		return 1;
	}
}

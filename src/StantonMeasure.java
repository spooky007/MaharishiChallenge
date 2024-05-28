
public class StantonMeasure {

	public int stantonMeasure(int[] a) {
		int len = a.length;
		int count1 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == 1) {
				count1++; 
			}
		}
		int count2 = 0;
		for (int i = 0; i < len; i++) {
			if (a[i] == count1) {
				count2++;
			}
		}
		return count2;
	}
}

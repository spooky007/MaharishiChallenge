public class UpdateMileageCounter {

	public void updateMileageCounter(int[] a, int miles) {
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int carrier = (a[i] + miles) / 10;
			a[i] = (a[i] + miles) % 10;
			miles = carrier;
		}
	}
}

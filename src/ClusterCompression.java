
public class ClusterCompression {

	public int[] clusterCompression(int[] a) {
		int len = a.length;
		if (len == 0) {
			return new int[] {};
		}
		int count = 1;
		int previous = a[0];
		for (int i = 1; i < len; i++) {
			if (a[i] != previous) {
				previous = a[i];
				count++;
			}
		}
		int[] clusterArray = new int[count];
		clusterArray[0] = a[0];
		previous = a[0];
		int index = 0;
		for (int i = 1; i < len; i++) {
			if (a[i] != previous) {
				clusterArray[++index] = a[i];
				previous = a[i];
			}
		}
		return clusterArray;
	}
}

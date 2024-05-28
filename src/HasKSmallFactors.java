
public class HasKSmallFactors {

	public boolean hasKSmallFactors(int k, int n) {
		if (k < 0 || n < 0) {
			return false;
		}
		int u = 0;
		while (u < k) {
			int v = u;
			while (v < k) {
				if (u * v == n) {
					return true;
				}
				v++;
			}
			u++;
		}
		return false;
	}
}

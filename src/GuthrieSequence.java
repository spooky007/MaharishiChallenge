
public class GuthrieSequence {

	public static int isGuthrieSequence(int[] a) {
		int len = a.length;
		if (a[0] < 0 || a[len - 1] != 1) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (a[i] % 2 == 0 && a[i+1] != a[i] / 2) {
				return 0;
			}
			if (a[i] % 2 == 1 && a[i+1] != (a[i] * 3) + 1) {
				return 0;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		System.out.println(isGuthrieSequence(new int[] {7, 22, 11, 34, 17, 52, 26, 13, 40,
				20, 10, 5, 16, 8, 4, 2, 1}));
		System.out.println(isGuthrieSequence(new int[] { 8, 17, 4, 1 }));
		System.out.println(isGuthrieSequence(new int[] { 8, 4, 1 }));
		System.out.println(isGuthrieSequence(new int[] { 8, 4, 2 }));

	}
}

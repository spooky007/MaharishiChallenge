import java.util.Arrays;

public class Solve10 {

	public static int[] solve10() {
		int factorial10 = factorial(10);
		int x = 0;
		int y = 0;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (i != j) {
					if (factorial(i) + factorial(j) == factorial10) {
						x = i;
						y = j;
						break;
					}
				}
			}
		}
		return new int[] { x, y };
	}

	public static int factorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		int factorial = 1;
		while (n != 1) {
			factorial *= n;
			n--;
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println(factorial(10 ));
		System.out.println(Arrays.toString(solve10()));
	}
}


public class PerfectSquare {

	public static void main(String[] args) {
		System.out.println(nextPerfectSquare(16));
	}
	
	public static int nextPerfectSquare(int n) {
		int num = 0;
		int square = 0;
		while (square <= n) {
			num++;
			square = num * num;
		}
		return square;
	}
}

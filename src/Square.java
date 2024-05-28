
public class Square {

	public int isSquare(int n) {
		int i = 0;
		while (i <= n) {
			if (i * i == n) {
				return 1;
			}
			i++;
		}
		return 0;
	}
}

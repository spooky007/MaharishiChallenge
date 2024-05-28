
public class ComputeDepth {

	public int computeDepth(int n) {
		int[] numbers = new int[10];
		int limit = 0;
		int multiple = n;
		int depth = 0;
		boolean arrayIsFull = false;
		while (!arrayIsFull) {
			int number = multiple;
			while (number != 0) {
				int remainder = number % 10;
				boolean alreadyExists = false;
				for (int i = 0; i < limit; i++) {
					if (numbers[i] == remainder) {
						alreadyExists = true;
					}
				}
				if (!alreadyExists) {
					numbers[limit++] = remainder;
				}
				number /= 10;
			}
			if (limit == 10) {
				arrayIsFull = true;
			}
			multiple += n;
			depth++;
		}
		return depth;
	}
}

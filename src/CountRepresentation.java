
public class CountRepresentation {

	public int countRepresentations(int numRupees) {
		int count = 0;
		int sum = 0;
		for (int rupee20 = 0; rupee20 <= numRupees/20; rupee20++) {
			for (int rupee10 = 0; rupee10 <= numRupees/10; rupee10++) {
				for (int rupee5 = 0; rupee5 <= numRupees/5; rupee5++) {
					for (int rupee2 = 0; rupee2 <= numRupees/2; rupee2++) {
						for (int rupee1 = 0; rupee1 <= numRupees; rupee1++) {
							sum =  (rupee20 * 20) + (rupee10 * 10) + (rupee5 * 5) + (rupee2 * 2) + (rupee1 * 1);
							if (sum == numRupees) {
								count++;
							}
						}
					}
				}
			}
		}
		return count;
	}
}


public class BEQNumber {

	public static int isSmallestBEQNumber() {
		for (int i = 0; ;i++) {
			int count6 = 0;
			int cube = i * i * i;
			while (cube != 0) {
				if (cube % 10 == 6) {
					count6++;
				}
				cube /= 10;
			}
			if (count6 == 4) {
				return i;
			}
		}
	}
	
	  static int findSmallestBEQNumber() {
	        int beqNumber;
	        int number = 1;
	        while (true) {
	            beqNumber = number * number * number;
	            int countOf6 = 0;

	            while (beqNumber > 0) {
	                int digit = beqNumber % 10;
	                beqNumber /= 10;
	                if (digit == 6)
	                    countOf6++;
	            }
	            if (countOf6 == 4) {
	                return number;
	            }
	            number++;
	        }
	    }
	
	public static void main(String[] args) {
		System.out.println(findSmallestBEQNumber());
		System.out.println(isSmallestBEQNumber());

	}
}

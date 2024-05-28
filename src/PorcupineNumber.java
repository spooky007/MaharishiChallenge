
public class PorcupineNumber {
	
	public static void main(String[] args) {
		System.out.println(findPorcupineNumber(139));
	}

	public static int findPorcupineNumber(int n) {
		for (int i = n + 1; ; i++) {
			int lastDigit = i % 10;
			int porcupineNumber = i;
			if (isPrime(i) && lastDigit == 9) {
				while(true) {
					i++;
					lastDigit = i % 10;
					if (isPrime(i)) {
						if (lastDigit == 9) {
							return porcupineNumber;
						} else {
							break;
						}
					} 
				}
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && n != 2) {
				return false;
			}
		}
		return true;
	}
}

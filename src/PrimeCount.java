
public class PrimeCount {

	public static int primeCount(int start, int end) {
		int count = 0;
		for(int i = start; i <= end; i++) {
			if(isPrime(i)) {
				count++;
			}
		}
		return count;
	}
	
	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0 && n != 2) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(4));
		System.out.println(primeCount(10, 30));
	}
}

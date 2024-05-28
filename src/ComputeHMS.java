
public class ComputeHMS {

	public int[] computeHMS(int seconds) {
		int divisor = 60 * 60;
		int[] hms = new int[3];
		int remainder = seconds;
		int i = 0;
		while (remainder > 0) {
			int quotient = remainder / divisor;
			remainder = remainder % divisor;
			hms[i++] = quotient;
			divisor /= 60; 
		}
		return hms;
	}
}

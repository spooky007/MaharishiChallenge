
public class Is121Array {

	public int is121Array1(int[] a) {
		int len = a.length;
		int countBefore = 0;
		int countAfter = 0;
		boolean leftFlag = false;
		boolean rightFlag = false;
		boolean twoExists = false;
		for (int i = 0, j = len - 1; j >= i; i++, j--) {
			if (a[i] < 1 || a[i] > 2 || a[j] < 1 || a[j] > 2) {
				return 0;
			}
			if (a[i] == 1) {
				if (!leftFlag) {
					countBefore++;
				} else {
					return 0;
				}
			}
			if (a[j] == 1) {
				if (!rightFlag) {
					countAfter++;
				} else {
					return 0;
				}
			}
			if (a[i] == 2) {
				twoExists = true;
				leftFlag = true;
			}
			if (a[j] == 2) {
				twoExists = true;
				rightFlag = true;
			}
		}
		if (countBefore != countAfter || countBefore == 0 || countAfter == 0 || twoExists == false) {
			return 0;
		}
		return 1;
	}

	public int is121Array2(int[] a) {
		int len = a.length;
		boolean leftNonOnes = false;
		boolean rightNonOnes = false;
		boolean contains1 = false;
		boolean contains2 = false;
		for (int i = 0, j = len - 1; i < len && i <= j; i++, j--) {
			if (a[i] != 1 && a[i] != 2) {
				return 0;
			}
			if (a[j] != 1 && a[j] != 2) {
				return 0;
			}
			if (a[i] == 1 || a[j] == 1) {
				contains1 = true;
			}
			if (a[i] != a[j]) {
				return 0;
			}
			if (a[i] == 2 || a[j] == 2) {
				contains2 = true;
			}
			if (a[i] == 2 && !leftNonOnes) {
				leftNonOnes = true;
			}
			if (a[j] == 2 && !rightNonOnes) {
				rightNonOnes = true;
			}
			if (leftNonOnes && rightNonOnes) {
				if (a[i] == 1 || a[j] == 1) {
					return 0;
				}
			}
		}
		if ( contains1 == false || contains2 == false ) {
			return 0;
		}
		return 1;
	}
	
    public int is121Array(int[] a) {
        if (a[0] != 1 || a[a.length - 1] != 1) {
            return 0;
        }
        int i, j;
        boolean flag = false;
        for (i = 0, j = a.length - 1; i < a.length && j >= 0 && i <= j; i++, j--) {
            if (a[i] != 1 || a[j] != 1) {
                if (a[i] != 2 || a[j] != 2)
                    return 0;
                else {
                    flag = true;
                    break;
                }
            }
        }
        for (int index = i; index <= j; index++) {
            if (a[index] != 2)
                return 0;
        }
        if (flag) return 1;
        return 0;
    }
}

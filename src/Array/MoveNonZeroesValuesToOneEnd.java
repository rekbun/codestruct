package Array;

public class MoveNonZeroesValuesToOneEnd {

	/**
	 * Moves all non-zero values to the front of the array and returns how many there are.
	 * Original order does not need to be maintained.
	 * @param a The array to remove all zeroes from.
	 * @return The number of non-zero values in a.
	 *
	 * Example:
	 *      in: a = [ 0, 1, 3, 0, 2, 0 ];
	 *     out: a = [ 1, 3, 2, *, *, * ]; * = doesn't matter
	 * optimal: a = [ 2, 1, 3, *, *, * ]; (least writes)
	 *  return: 3
	 */
	int removeZeroes(int[] a) {
		if(a==null || a.length==0) {
			return 0;
		}

		int i=-1;
		for(int j=0;j<a.length;j++) {
			if(a[j]!=0) {
				a[++i]=a[j];
			}
		}
		return i+1;
	}


	int removeZeroesOptimal(int[] a) {
		if(a==null || a.length==0) {
			return 0;
		}

		int f=0;
		int l=a.length-1;
		while(f<l) {
			while(f<a.length && a[f]!=0) {
				f++;
			}

			while(l>=0&& a[l]==0) {
				l--;
			}

			if(f<l) {
				a[f++]=a[l--];
			}

		}
		return l+1;
	}

}

package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/18/13
 * Time: 8:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class FixedIndex {
	public int fixedIndex(int[] src) {
		int s=0;
		int e=src.length-1;

		while(s<=e) {
			int mid=(s+e)/2;
			if(src[mid]==mid) {
				return mid;
			}
			if(src[mid]<mid) {
				s=mid+1;
			}else {
				e=mid-1;
			}

		}
		return -1;
	}
}

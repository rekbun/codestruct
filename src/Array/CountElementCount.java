package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/15/13
 * Time: 6:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountElementCount {
	public int countElement(int[] src,int k) {
		int left=countLeftIndex(src,0,src.length-1,k);
		int right=countRightIndex(src, 0, src.length - 1, k);
		return (right-left+1);
	}

	private int countRightIndex(int[] src, int s, int e, int k) {
		if(s>e) {
			return 0;
		}

		while(s<e) {
			int mid=(s+e)/2;
			if(src[mid]==k && (mid<e && src[mid+1]>k)) {
				return mid;
			}
			if(src[mid]>k) {
				e=mid-1;
			}else {
				s=mid+1;
			}

		}
		return e;
	}

	private int countLeftIndex(int[] src, int s, int e, int k) {
		if(s>e) {
			return 0;
		}

		while(s<e) {
			int mid=(s+e)/2;
			if(src[mid]==k && (mid>0 && src[mid-1]<k)) {
				return mid;
			}
			if(src[mid]<k) {
				s=mid+1;
			}else {
				e=mid-1;
			}

		}
		return e;
	}

}

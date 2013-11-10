package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindElementInPivotArray {

	private int findPivot(int[] src,int s,int e) {
		while(s<e) {
			int mid=(s+e)/2;
			if((mid>0&& src[mid-1]<src[mid])&& (src[mid]<src[e])) {
				return mid+1;
			}else if(mid>0 && src[mid-1]>src[mid] && (src[mid]<src[e])) {
				return mid;
			}else if(src[mid]>src[e]) {
				s=mid;
			}else {
				e=mid;
			}
		}
		return e;
	}
	private int findElementInPivotArrayUtil(int[] src,int s,int e,int k) {
		while(s<=e) {
			int mid=(s+e)/2;
			if(src[mid]==k) {
				return mid;
			}else if(src[mid]>k) {
				e=mid-1;

			}else {
				s=mid+1;
			}
		}
		return -1;
	}

	public int findElementInPivotArray(int[] src,int k) {

		int x=findPivot(src,0,src.length-1);
		if(x==-1) {
			return findElementInPivotArrayUtil(src,0,src.length-1,k);
		}
		if(src[x]==k) {
			return x;
		}else if(src[x]>k) {
			return -1;
		}else if(src[x]<k&& src[src.length-1]>=k) {
			return findElementInPivotArrayUtil(src,x+1,src.length,k);
		}else {
			return findElementInPivotArrayUtil(src,0,x-1,k);
		}

	}
}

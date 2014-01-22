package Array;

public class FindMinInRotatedArray {
	public int findMin(int[] src) {
		if(src==null || src.length==0) {
			return 0;
		}
 	    return findMinUtil(src,0,src.length-1);

	}

	private int findMinUtil(int[] src, int s, int e) {
		if(s<e) {
			if(s+1==e) {
				if(src[s]>src[e]) {
					return e;
				}else{
					return s;
				}
			}
			int mid=(s+e)/2;

			if(mid>0 && (src[mid-1]<src[mid]) && (src[mid]>src[mid] && mid+1<e)) {
				return mid+1;
			}
			if(src[mid]<src[e]) {
				return findMinUtil(src,s,mid);
			}else{
				return findMinUtil(src,mid,e);
			}
		}
		return 0;
	}
}

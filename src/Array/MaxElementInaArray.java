package Array;

public class MaxElementInaArray {

	public int getMaxElementInArray(int[] src) {
		if(src==null) {
			return -1;
		}

		return getMaxArray(src,0,src.length-1);
	}

	private int getMaxArray(int[] src,int s,int e ) {
		if(s<e) {
			int mid=(s+e)/2;
			if(s==e-1) {
				if(src[s]<src[e]) {
					return src[e];
				}else {
					return src[s];
				}
			}
			if(src[mid-1]<src[mid]) {
				return getMaxArray(src, mid, e);
			}else {
				return getMaxArray(src, s, mid);
			}
		}
		return src[s];
	}
}

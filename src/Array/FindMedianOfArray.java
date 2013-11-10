package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 5:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindMedianOfArray {
	private int findMedian(int[] src,int s,int e) {
		if((s-e+1)%2==0) {
			return src[(e-s+1)/2]+src[(e-s)/2+1];
		}
		return src[(e-s+1)/2];
	}

	public int findMedianOfArray(int[] arr5,int[] arr6,int s5,int e5,int s6,int e6) {
		if((e5-s5)==1) {
			return (arr5[0]+arr6[0])/2;
		}
		if(e5-s5==2) {
			return (Math.max(arr5[0],arr6[0])+Math.min(arr5[1],arr6[1]))/2;
		}

		int m1=findMedian(arr5,s5,e5);
		int m2=findMedian(arr6,s6,e6);

		if(m1==m2) {
			return m1;
		}
		if(m1<m2) {
			if((e5-s5+1)%2==0) {
				return findMedianOfArray(arr5, arr6,(e5+s5)/2-1,e5,s6,(e6+s6)/2+1);
			}
			return findMedianOfArray(arr5, arr6,(e5+s5)/2,e5,s6,(e6+s6)/2);
		}else {
			if((e5-s5+1)%2==0) {
				return findMedianOfArray(arr5, arr6,s5,(e5+s5)/2+1,(e6+s6)/2-1,e6);
			}
			return findMedianOfArray(arr5, arr6,s5,(e5+s5)/2,(e6+s6)/2,e6);
		}
	}
}

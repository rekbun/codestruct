package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:45 AM
 * To change this template use File | Settings | File Templates.
 */
public class LargestContiguousSubArray {
	public int largestContiguousSubArray(int[] src) {
		int cur_max=src[0];
		int ret_max=src[0];
		for(int i=1;i<src.length;i++) {

			if(cur_max<0 || cur_max+src[i]<0) {
				cur_max=src[i];
				if(cur_max>ret_max) {
					ret_max=cur_max;
				}
				continue;
			}
			cur_max+=src[i];
			if(cur_max>ret_max) {
				ret_max=cur_max;
			}
		}

		return ret_max;
	}
}

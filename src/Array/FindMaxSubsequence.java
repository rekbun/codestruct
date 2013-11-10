package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 7:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindMaxSubsequence {
	public int findMaxSubSequence(int[] src) {
		int cMax=src[0];
		int rMax=0;

		for(int i=1;i<src.length;i++) {
			int tem=rMax;
			rMax=Math.max(rMax,cMax);
			cMax=tem+src[i];
		}
		return Math.max(rMax,cMax);
	}
}

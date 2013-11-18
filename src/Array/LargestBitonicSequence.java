package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/18/13
 * Time: 10:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargestBitonicSequence {
	public int largestBitonicSequence(int[] src) {
		int[] inc = new int[src.length];
		int[] dec = new int[src.length];

		for(int i=1;i<src.length;i++) {
			if(src[i]>src[i-1]) {
				inc[i]=inc[i-1]+1;
			}else {
				inc[i]=1;
			}
		}

		for(int i=src.length-2;i>=0;i--) {
			if(src[i]>src[i+1]) {
				dec[i]=dec[i+1]+1;
			}else {
				dec[i]=1;
			}

		}

		int max=0;
		for(int i=0;i<src.length;i++) {
			if(inc[i]+dec[i]-1>max) {
				max=inc[i]+dec[i]-1;
			}
		}
		return max;
	}
}

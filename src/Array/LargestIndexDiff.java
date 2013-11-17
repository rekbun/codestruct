package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/17/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargestIndexDiff {
	public int largestIndexDiff(int[] src) {
		int[] lMin=new int[src.length];
		int[] rMax=new int[src.length];

		int min=src[0];
		for(int i=0;i<src.length;i++) {
			if(min<src[i]) {
				min=src[i];
			}
			lMin[i]=min;
		}

		rMax[src.length-1]= src[src.length-1];
		for(int i=src.length-2;i>=0;i--) {
			rMax[i]= Math.max(rMax[i+1],src[i]);
		}

		int xi=0,xj=0;
		min=0;
		while(true) {
			if(lMin[xi]<rMax[xj]) {
				min=Math.max(min,xj-xi);
				xj++;
			}else {
				xi++;
			}

			if(xi>=src.length || xj>=src.length) {
				break;
			}
		}
		return min;
	}
}

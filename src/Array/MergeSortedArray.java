package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 4:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortedArray {
	private int moveToEnd(int[] mPlusN) {
		int s=0;
		for(int i=0;i<mPlusN.length;i++) {
		    if(mPlusN[i]!=-1) {
			    mPlusN[s++]=mPlusN[i];
		    }
		}
		return s;
	}

	public void mergeSortedArray(int[] mPlusN,int[] N,int m) {
		int cnt=moveToEnd(mPlusN);

		int sm=cnt-1;
		int sn=N.length-1;
		int cur=mPlusN.length-1;
		while(sm>=0 && sn>=0) {
			if(mPlusN[sm]<N[sn]) {
				mPlusN[cur]=mPlusN[sm];
				sm--;
			}else {
				mPlusN[cur]=N[sn];
				sn--;
			}
		}

		while(sm>=0) {
			mPlusN[cur]=mPlusN[sm];
			sm--;
		}

		while(sn>=0) {
			mPlusN[cur]=N[sn];
			sn--;
		}
	}
}

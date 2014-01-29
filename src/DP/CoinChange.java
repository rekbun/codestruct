package DP;

public class CoinChange {
	public int coinChange(int[] src,int n) {
		if(src==null) {
			return 0;
		}
		int[] mw= new int[n+1];
		mw[0]=1;

		for(int i=1;i<=n;i++) {
			for(int j=0;j<src.length;j++) {
				if(i-src[j]>=0 && mw[i-src[j]]>0) {
					mw[i]+=mw[i-src[j]];
				}
			}
		}
		return mw[src.length];
	}
}

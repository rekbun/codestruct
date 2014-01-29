package DP;

public class Knapsack01 {
	public int knapsack(int [] src,int W) {

		boolean  [] kp=new boolean[W+1];
		kp[0]=true;
		int ret=0;
		for(int i=1;i<=W;i++) {
			for(int j=0;j<src.length;j++) {
				if(i-src[j]>=0 && kp[i-src[i]]) {
					kp[i]=true;
					ret=i;
					break;
				}
			}
		}
		return ret;
	}
}

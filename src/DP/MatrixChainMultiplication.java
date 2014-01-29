/*
http://www.geeksforgeeks.org/dynamic-programming-set-8-matrix-chain-multiplication/
 */
package DP;

public class MatrixChainMultiplication {
	public int matrixChainMultiplication(int [] src) {

		int [][] mc=new int[src.length+1][src.length+1];
		mc[0][0]=0;

		for(int len=0;len<src.length+1;len++) {
			for(int i=0;i+len<src.length;i++) {
				int j=i+len;
				mc[i][j]=Integer.MAX_VALUE;
				if(len==1 || len==0) {
					mc[i][j]=0;
					continue;
				}
				for (int k=i+1;k<j;k++) {
					mc[i][j]=Math.min(mc[i][j],mc[i][k]+mc[k][j]+src[i]*src[k]*src[j]);
				}
			}
		}
		return mc[0][src.length-1];
	}
}

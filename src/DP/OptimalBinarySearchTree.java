/*
http://www.geeksforgeeks.org/dynamic-programming-set-24-optimal-binary-search-tree/
 */
package DP;

public class OptimalBinarySearchTree {
	public int optimalBinarySearchTree(int[] keys, int[] freq) {
		int [] cs=findSum(freq);

		int [][] obt= new int[keys.length+1][freq.length+1];
		for(int len=0;len<keys.length+1;len++) {
			for (int i=0;i+len<keys.length;i++) {
				int j=i+len;
				if(len==0) {
					obt[i][j]=0;
				}
				obt[i][j]=Integer.MAX_VALUE;
				for(int k=i;k<=j;k++) {
					obt[i][j]=Math.min(obt[i][j],k-1>=0?obt[i][k-1]:0+k+1<=j?obt[k+1][j]:0+getSum(cs,i,j));
				}
			}
		}
		return obt[0][keys.length-1];
	}

	private int getSum(int[] cs, int i, int j) {
		return cs[j]-cs[i];
	}

	private int[] findSum(int[] freq) {
		int [] cs=new int[freq.length];
		cs[0]=freq[0];
		for(int i=1;i<cs.length;i++) {
			cs[i]=freq[i]+cs[i-1];
		}
		return cs;
	}
}


/*
The following is a description of the instance of this famous puzzle involving n=2 eggs and a building with k=36 floors.

Suppose that we wish to know which stories in a 36-story building are safe to drop eggs from, and which will cause the eggs to break on landing. We make a few assumptions:

…..An egg that survives a fall can be used again.
…..A broken egg must be discarded.
…..The effect of a fall is the same for all eggs.
…..If an egg breaks when dropped, then it would break if dropped from a higher floor.
…..If an egg survives a fall then it would survive a shorter fall.
…..It is not ruled out that the first-floor windows break eggs, nor is it ruled out that the 36th-floor do not cause an egg to break.


http://www.geeksforgeeks.org/dynamic-programming-set-11-egg-dropping-puzzle/
 */

package DP;

public class EggBreak {
	public int eggBreak(int n,int k) {
		if(k==1) {
			return n;
		}

		int [][] mt=new int[n+1][k+1];


		//base case
		for(int i=0;i<=k;i++) {
			mt[0][i]=0;
			mt[1][i]=1;
		}

		for(int i=0;i<=n;i++) {
			mt[i][1]=i;
		}

		for(int i=1;i<=k;i++) {
			for (int j=2;j<=n;j++) {
				mt[j][i]=Integer.MAX_VALUE;
				for(int x=1;x<=n;x++) {
					int max= Math.max(mt[x-1][i-1],mt[j-x][i]);
					if(max<mt[j][i]) {
						mt[j][i]=max;
					}
				}
			}
		}
		return mt[n][k];
	}
}

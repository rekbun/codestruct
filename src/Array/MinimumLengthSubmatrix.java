package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/13/13
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class MinimumLengthSubmatrix {
	 public Pair<Integer,Integer> minimumLengthSubMatrix(int[][] src) {
		int[][] dp= new int[src.length][src[0].length];
		for(int i=0;i<src.length;i++) {
			for(int j=0;j<src[0].length;j++) {
				dp[i][j]=-1;
			}
		}

		Pair<Integer,Integer> pair=new Pair<Integer, Integer>();
		minimumLengthSubMatrixUtil(src,0,0,dp);
		int max=0;
		for(int i=0;i<src.length;i++) {
			for(int j=0;j<src[0].length;j++) {
				if(dp[i][j]>max) {
					max=dp[i][j];
					pair.first=i;
					pair.second=j;
				}
			}
		}
		return pair;
	 }

	private int minimumLengthSubMatrixUtil(int[][] src, int row, int col, int[][] dp) {
		if(row>=src.length || col>=src[0].length) {
			return 0;
		}
		if(dp[row][col]!=-1) {
			return dp[row][col];
		}

		int max1 = minimumLengthSubMatrixUtil(src,row+1, col, dp);
		int max2 =minimumLengthSubMatrixUtil(src, row, col+1, dp);
		int max3=minimumLengthSubMatrixUtil(src,row+1,col+1, dp);
		int min=Math.min(max1,max2);
		if(src[row][col]==0) {
			min=0;
		}else {
			min=Math.min(min,max3)+1;
		}
		dp[row][col]=min;
		return dp[row][col];  //To change body of created methods use File | Settings | File Templates.
	}
}

package leetCode;

public class NQueen {

	public int solve(int n) {

		return solveUtil(0,n,new int[n]);

	}
	private int solveUtil(int row, int n, int[] place) {
		if(row==n) {
			return 1;
		}
		int total=0;
		for(int c=0;c<n;c++) {
			if(canPlace(place,row,c)) {
				place[row]=c;
				total+= solveUtil(row + 1, n, place);
			}
		}
		return total;
	}


	boolean canPlace(int[] place,int r,int c) {
		for(int i=0;i<r;i++) {
			if((place[i]==c ||(Math.abs(i-r)==Math.abs(place[i]-c))) {
				return false;
			}
		}
		return true;
	}



}

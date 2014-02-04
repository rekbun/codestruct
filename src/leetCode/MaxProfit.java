package leetCode;

public class MaxProfit {
	public int maxProfit(int[] src) {
		if(src==null || src.length==0) {
			return 0;
		}
		int mp=0;
		for(int i=1;i<src.length;i++) {
			if(src[i]>src[i-1]) {
				mp+=src[i]-src[i-1];
			}
		}
		return mp;

	}
}

package Array;

import java.util.ArrayList;

public class FindTriplet {
	public int[] findTriplet(int[] src) {
		int[] ln=new int[src.length];
		int[] rn=new int[src.length];
		ln[0]=src[0];
		for(int i=1;i<src.length;i++) {
			if(src[i]<ln[i-1]) {
				ln[i]=src[i];
			}else {
				ln[i]=ln[i-1];
			}
		}

		rn[src.length-1]=src[src.length-1];
		for(int i=src.length-2;i>=0;i--) {
			if(src[i]>ln[i+1]) {
				ln[i]=src[i];
			}else {
				ln[i]=ln[i+1];
			}
		}

		for(int i=0;i<src.length;i++) {
			if(ln[i]<src[i] && src[i]<rn[i]) {
				return new int[]{ln[i],src[i],rn[i]};
			}
		}

		return null;
	}
}

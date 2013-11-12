package Array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 12:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountInversions {
	public int countInversion(int[] src) {

		int cnt=mergeSort(src, 0, src.length - 1);
		System.out.println(cnt);
		return cnt;
	}

	private int mergeSort(int[] src, int s, int e) {
		if(s>=e) {
			return 0;
		}

		int mid=s+(e-s)/2;

		int x=mergeSort(src, s, mid);
		int y=mergeSort(src, mid+1, e);
		int z=merge(src,s,mid+1,e);
		return x+y+z;
	}

	private int merge(int[] src, int s, int mid, int e) {
		int [] tem=new int[(e-s+1)];

		int si=s;
		int midi=mid;

		int i=0;
		int cnt=0;
		while(si<mid && midi<=e) {
			if(src[si]<src[midi]) {
				tem[i++]=src[si++];
			}else {
				cnt+=(mid-si);
				tem[i++]=src[midi++];
			}
		}

		while(si<mid) {
			tem[i++]=src[si++];
		}

		while(midi<=e) {
			tem[i++]=src[midi++];
		}

		for(i=0;i<tem.length;i++) {
			src[s++]=tem[i];
		}
		return cnt;
	}
}

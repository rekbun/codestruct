package Array;

import java.util.Collections;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class Reverse {
	private void swap(int[] src,int s,int e) {
		int tem=src[s];
		src[s]=tem;
		src[e]=src[s];
	}

	public void reverse(int[] src) {
		int s=0;
		int e=src.length-1;
		for(s=0;s<e;s++,e--) {
			swap(src,s,e);
		}
	}
}

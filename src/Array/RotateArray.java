package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 6:16 PM
 * To change this template use File | Settings | File Templates.
 */
public class RotateArray {

	public void swap(int[] src,int s,int e) {
		int tem=src[s];
		src[s]=src[e];
		src[e]=tem;
	}

	private void reverse(int[] src,int s,int e) {
	    while(s<e) {
		    swap(src,s++,e--);
	    }
	}

	public void rotate(int[] src,int n) {
		reverse(src,0,src.length);
		reverse(src,0,src.length-n);
		reverse(src,src.length-n,src.length-1);
	}
}

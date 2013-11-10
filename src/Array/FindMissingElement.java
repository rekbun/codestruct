package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindMissingElement {
	public int findMissingElement(int [] src) {
		int xor=0;

		for(int i=1;i<=src.length+1;i++) {
			xor^=i;
		}

		for(int i=0;i<src.length;i++) {
			xor^=src[i];
		}
		return xor;
	}
}

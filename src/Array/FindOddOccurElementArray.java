package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class FindOddOccurElementArray {
	public int findOddOccurElementArray(int [] src) {
		int xor=0;
		for(int i=0;i<src.length;i++) {
			xor^=src[i];
		}
		return xor;
	}

}

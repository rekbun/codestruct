package Array;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 8:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Find2Smallest {
	public Pair<Integer,Integer> find2Smallest(int[] src) {
		int first=src[0]<src[1]?src[0]:src[1];
		int second=src[0]<src[1]?src[1]:src[0];

		for(int i=2;i<src.length;i++) {
			if(src[i]<first) {
				second=first;
				first=src[i];
			}else if(src[i]<second && src[i]!=second) {
				second=src[i];
			}
		}
		Pair<Integer,Integer> pair=new Pair<Integer, Integer>();
		pair.first=first;
		pair.second=second;
		return pair;
	}
}

package Array;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/9/13
 * Time: 11:45 PM
 * To change this template use File | Settings | File Templates.
 */

class Pair<T,K> {
	T first;
	K second;
}
public class FindPair {
	public Pair<Integer,Integer> findPair(int [] src,int k) {
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		Pair<Integer,Integer> ret=new Pair<Integer, Integer>();
		for(int i=0;i<src.length;i++) {
			if(map.containsKey(k-src[i])) {
				ret.first=i;
				ret.second=map.get(k-src[i]);
			}else {
				map.put(src[i],i);
			}
		}
		return ret;
	}
}

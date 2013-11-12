package Array;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/12/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClosestToZero {
	public Pair<Integer,Integer> closestToZero(int[] src) {
		Arrays.sort(src);
		int s=0;
		int e=src.length-1;
		int min=Integer.MAX_VALUE;
		Pair<Integer,Integer> pair=new Pair<Integer, Integer>();
		while(s<e) {
			if(Math.abs(src[s]+src[e])<Math.abs(min)) {
				min=src[s]+src[e];
				pair.first=s;
				pair.second=e;
			}
			if(src[s]+src[e]>0) {
				e--;
			}else {
				s++;
			}
		}
		return pair;
	}
}

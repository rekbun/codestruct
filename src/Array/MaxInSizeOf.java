package Array;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/17/13
 * Time: 10:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class MaxInSizeOf {
	public void maxInSizeOf(int[] src,int k) {
		Deque<Integer> deque=new ArrayDeque<Integer>();

		for(int i=0;i<k;i++) {
			while(!deque.isEmpty() && src[i]>src[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.add(i);
		}
		System.out.println(src[deque.peekFirst()]);
		for(int i=k+1;i<src.length;i++) {
			if(i-deque.peekFirst()>=k)
			{
				deque.removeFirst();
			}
			while(!deque.isEmpty() && src[i]>src[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.add(src[i]);
			System.out.println(src[deque.peekFirst()]);
		}
	}
}

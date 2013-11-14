package Array;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/14/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class FindLargestToTheRight {
	public void findLargestToTheRight(int[] src) {
		int[] right_max=new int[src.length];
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=src.length-1;i>=0;i--) {
			while(!stack.empty() && src[i]>stack.peek()) {
				stack.pop();
			}
			if(!stack.empty())  {
				right_max[i]=stack.peek();
			}else {
				right_max[i]=-1;
			}
			stack.push(src[i]);
		}
	}
}

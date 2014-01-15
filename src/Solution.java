import Array.CountPairWithDiffK;
import Heap.MergeKSortedArray;
import Heap.MinHeap;

/**
 * Created with IntelliJ IDEA.
 * User: rakeshkumar
 * Date: 11/10/13
 * Time: 12:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Solution {
	public static void main(String[] args) {
		CountPairWithDiffK sol= new CountPairWithDiffK();
		int ans=sol.countPairWithDiffK(new int[]{1,5,3,4,2},3);
		ans=sol.countPairWithDiffK(new int[]{8, 12, 16, 4, 0, 20},4);
		MinHeap minHeap=new MinHeap(8);
		minHeap.insert(3);
		minHeap.insert(2);
		minHeap.insert(4);
		minHeap.insert(7);
		System.out.println(minHeap.extractMin());
		System.out.println(minHeap.extractMin());
		MergeKSortedArray snd=new MergeKSortedArray();
		int [] val=snd.mergeKSortedArray(new int[][]{{1,2,3}, {4,6,7},{7,8,9}});

	}


}

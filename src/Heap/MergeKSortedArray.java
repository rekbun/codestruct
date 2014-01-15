package Heap;

import java.util.PriorityQueue;

class HeapNode implements Comparable<HeapNode> {
	int val;
	int i;
	int j;

	public HeapNode(int value,int index,int nextElement) {
		val=value;
		i=index;
		j=nextElement;
	}


	@Override
	public int compareTo(HeapNode heapNode) {
		if(this.val<heapNode.val) {
			return -1;
		}
		return 1;
	}
}
public class MergeKSortedArray {
	public int[] mergeKSortedArray(int[][] src) {

		PriorityQueue<HeapNode> heap=new PriorityQueue<HeapNode>();
		for(int i=0;i<src.length;i++) {
			HeapNode node=new HeapNode(src[i][0],i,1);
			heap.add(node);
		}

		int[] ret=new int[src.length*src[0].length];
		int cnt=0;
		for(int i=0;i<src.length*src[0].length;i++) {
			HeapNode node=heap.poll();
			ret[cnt++]=node.val;
			if(node.j<src[0].length) {
				heap.add(new HeapNode(src[node.i][node.j],node.i,node.j+1));
			}else {
				heap.add(new HeapNode(Integer.MAX_VALUE,0,0));
			}
		}
		return ret;
	}
}

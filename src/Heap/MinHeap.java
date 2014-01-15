package Heap;

public class MinHeap {
	private int[] _array;
	int size;

	public  MinHeap(int n) {
		_array=new int[n];
	}

	public void insert(int el) {
		_array[size++]=el;
		int i=(size-1)/2;
		int cur=size-1;
		while(i>=0) {
			if(_array[i]>el) {
				int val=_array[i];
				_array[i]=el;
				_array[cur]=val;
			}
			if(i==0) {
				break;
			}
			cur=i;
			i=(i-1)/2;
		}

	}

	private void minHeapify(int i) {
		int left=getLeft(i);
		int right=getRight(i);
		int toSwap=i;
		if (i<size) {
			if(left<size && _array[left]<_array[i]) {
				toSwap=left;
			}
			if(right<size&& _array[right]<_array[toSwap]) {
				toSwap=right;
			}
			if(i==toSwap) {
				return;
			}
			int val=_array[i];
			_array[i]=_array[toSwap];
			_array[toSwap]=val;
			minHeapify(toSwap);
		}

	}

	private int getRight(int i) {
		return 2*i+2;
	}

	private int getLeft(int i) {
		return 2*i+1;
	}

	public int extractMin() {
		int el=_array[0];
		_array[0]=_array[--size];
		minHeapify(0);
		return el;
	}
}

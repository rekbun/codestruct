package Heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianRunningIntegers {
	public void findMedianRunningIntegers() {

		PriorityQueue<Integer> minHeap=new PriorityQueue<Integer>();
		PriorityQueue<Integer> maxHeap=new PriorityQueue<Integer>(10,Collections.reverseOrder());
		int size=0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		try {
			input=reader.readLine();
			int val=Integer.parseInt(input);
			minHeap.add(val);
			if(size%2==1) {
				int max=minHeap.poll();
				maxHeap.add(max);

			}
			size++;
			if(size%2==0) {
				System.out.println(minHeap.peek()+maxHeap.peek()/2);
			}else {
			    System.out.println(minHeap.peek());
			}
		} catch (IOException e) {
			e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
		}


	}
}

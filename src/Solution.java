import Integral.Test1;
import ThoughtSpot.RateLimiter;
import com.sun.script.util.BindingsEntrySet;

import java.io.*;
import java.util.*;

interface A{
	public static int a=0;
	public  void ab();
}

interface B{
	public static int a=0;
	public void ab();
}

public class Solution implements A,B {
	public static void Solution(){

	}

	public static void main(String args[] ) throws Exception {

		//print(1,4,new LinkedList<Integer>());
	}

	public  void print(int a,int s,int sum,LinkedList<Integer> res) {

	}
	public  void print(int s,int sum,LinkedList<Integer> res) {

		if(sum<0) {
			return;
		}
		if(sum==0) {
			display(res);
		}

		for(int i=s;i<=sum;i++) {
			res.addLast(i);
			print(i,sum-i,res);
			res.removeLast();
		}
	}


	private static void display(List<Integer> res) {

		for(Integer integer:res) {

			System.out.print(integer +" ");
		}
		System.out.println();
		Stack stack;
		Queue queue;
		Map<Integer,Integer> map=null;
		for(Map.Entry<Integer, Integer> set: map.entrySet()) {

		}

	}

	@Override
	public void ab() {
		//To change body of implemented methods use File | Settings | File Templates.
	}
}
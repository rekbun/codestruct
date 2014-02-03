package Integral;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

class a{

	a() {
		System.out.println("a");
	}
}
public class Test1{

	String a,b;

	public Test1(String n1,String n2 ) {
		a=n1;
		b=n2;
	}

	public int hashCode() {
		return a.hashCode();
	}

	public boolean equals(Object o) {
		if(!(o instanceof Test1)) {
			return false;
		}

		Test1 t1=(Test1)o;
		return t1.a.equals(a)&& t1.b.equals(b);
	}
	public String get() {
		String a= null;
		String b="abc";
		this.a=null;
		Stack<Integer> stack=new Stack<Integer>();
		Deque<Integer> deque =new ArrayDeque<Integer>();
		LinkedList<Integer> list = new LinkedList<Integer>();
		a=b;
		return a;
	}
}




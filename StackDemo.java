package com.edu;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String>st=new Stack<>();
		st.push("one");
		st.push("two");
		st.push("Three");
		st.push("Four");

		
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.search("one"));
		int i=st.search("one");

       System.out.println(st.get(i-1));
	}

}

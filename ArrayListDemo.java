package com.edu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	int a[]=new int[5];
	ArrayList<Integer> ob=new ArrayList();
	ob.add(20);
	ob.add(20);
	ob.add(10);
	ob.add(30);
	ob.add(2);
	ob.add(50);

	/*
	 * ob.add(23.6); ob.add("Hello"); ob.add('c');
	 */
	System.out.println(ob);
	//ob.remove(2);
	//System.out.println(ob);
	//System.out.println(ob.contains(20));

	//ob.removeAll(ob);
	//System.out.println(ob);
	//ob.clear();
	//System.out.println(ob);
	/*
	 * Iterator it=ob.iterator(); while(it.hasNext()) {
	 * System.out.println(it.next()); }
	 */
	ListIterator<Integer>li=ob.listIterator();
	
	//print element in given order first to last

	while(li.hasNext())
	{
		System.out.println(li.next());
		
	}
	System.out.println("--------------------------------------");
	
	//print element in reverse order last to first sequense

	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}

	}
}

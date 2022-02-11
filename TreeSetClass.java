//It does not allow null value
package com.edu;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet();
		ts.add(2);
		ts.add(23);
		ts.add(45);
		ts.add(70);
		ts.add(2);
		//ts.add("Radha");
		//ts.add("Radha");
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("After Descending ");
		it =ts.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
;		//System.out.println(ts);

	}

}

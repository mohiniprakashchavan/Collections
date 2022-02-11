package com.edu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class FloatType {

	public static void main(String[] args) {
	ArrayList<Float> ob=new ArrayList();
	ob.add(10.5f);
	ob.add(1.5f);
	ob.add(30.5f);
	ob.add(21.5f);
	ob.add(22.5f);
	System.out.println(ob);
	/*
	 * Iterator it=ob.iterator(); while(it.hasNext()) {
	 * System.out.println(it.next()); }
	 */
	/*
	 * Collections.sort(ob); System.out.println(ob);
	 * 
	 * Collections.shuffle(ob); System.out.println(ob);
	 */

	ListIterator<Float>li=ob.listIterator();
	
	//print element in given order first to last
while(li.hasNext())
{
	System.out.println(li.next());
}
System.out.println("*****************************");

//print element in reverse order last to first sequense
while(li.hasPrevious()) {
	System.out.println(li.previous());
}

}

}

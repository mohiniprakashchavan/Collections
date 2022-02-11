package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

public class DoubleType {


		public static void main(String[] args) {
			ArrayList<Double> ob=new ArrayList();
			ob.add(10.5);
			ob.add(1.5);
			ob.add(30.5);
			ob.add(21.5);
			ob.add(22.5);
			System.out.println(ob);
			Iterator it=ob.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}


	}

}

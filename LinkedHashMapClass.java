package com.edu;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
	public static void main(String[] args) {
		//HashMap<Long,String> hm=new HashMap<Long,Double,String>();
		LinkedHashMap<Long,String> hm=new LinkedHashMap<Long,String>();
	     hm.put(9765435723l, "Mohini");
	     hm.put(9713456787l, "Rani");
	     hm.put(9987456538l, "Rohini");
	     hm.put(9678536453l, "Manisha");
	     for(Map.Entry m:hm.entrySet())
	 	{
	 		System.out.println(m.getKey()+" "+m.getValue());
	 	}

		}

}

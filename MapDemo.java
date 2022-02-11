//it allow insertion order 
//duplicate value not allow
package com.edu;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(101, "Mohini");
	map.put(103,"Rani");
	map.put(105,"Rani");
	map.put(104,"Rohini");
	System.out.println(map);
	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
	}
	

	}

}

// hashset does not allow duplicate element 
//it does not allow insertion order
//

package com.edu;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet();
		hs.add(12);
		hs.add(34);
		hs.add(12);
		hs.add(60);
		hs.add(40);
		hs.add(20);
		System.out.println(hs);

	}

}

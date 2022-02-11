package com.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StringType {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many element you want add");
int n=sc.nextInt();
for(int i=0;i<n;i++)
{
	System.out.println("Enter element");
	String val=sc.next();
	ob.add(val);
}
System.out.println(ob);
Iterator it=ob.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
	}

}

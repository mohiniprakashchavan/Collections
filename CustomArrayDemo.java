  package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Students
{
	int roll_no;
	String name;
	public Students(int roll_no, String name, float fees) {
		super();
		this.roll_no = roll_no;
		this.name = name;
		this.fees = fees;
	}
	float fees;

}
public class CustomArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students ob1=new Students(1,"Mohini",23000);
		Students ob2=new Students(2,"Radha",45000);
		ArrayList<Students> a=new ArrayList<>();
		a.add(ob1);
		a.add(ob2);
		//System.out.println(ob1);
		//System.out.println(ob2);
		Iterator it=a.iterator();
		System.out.println("Roll NO\t\tName\t\tFees");
		while(it.hasNext()) {
			Students st=(Students)it.next();
			System.out.print(st.roll_no+"\t\t"+st.name+"\t\t"+st.fees+"\t");
			System.out.println();
		}

	}

}

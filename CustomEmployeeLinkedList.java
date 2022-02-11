package com.edu;

import java.util.ArrayList;
import java.util.Iterator;

class Employee
{
	int empid;
	String name;
	float sal;
	int age;
	String dename;
	public Employee(int empid, String name, float sal, int age, String dename) {
		super();
		this.empid = empid;
		this.name = name;
		this.sal = sal;
		this.age = age;
		this.dename = dename;
	}
	
}
public class CustomEmployeeLinkedList {

	public static void main(String[] args) {
		ArrayList<Employee>al=new ArrayList();
	Employee ob1=new Employee(1,"abc",4500,36,"IT");
	Employee ob2=new Employee(2,"hyc",7500,36,"Comp");
	Employee ob3=new Employee(3,"asdc",89500,36,"ENTC");
	Employee ob4=new Employee(4,"abc",4500,36,"IT");
	Employee ob5=new Employee(5,"abc",4500,36,"IT");
 al.add(ob1);
 al.add(ob2);
 al.add(ob3);
 al.add(ob4);
 al.add(ob5);
 Iterator it=al.iterator();
 System.out.println("ID\tname\tsalary\tage\tdepartname");
 while(it.hasNext())
 {
	 Employee emp=(Employee)it.next();
	 System.out.println(emp.empid+"\t"+emp.age+"\t"+emp.name+"\t"+emp.dename+"\t"+emp.sal+"\t");
		/*
		 * System.out.print(emp.age+"\t"); System.out.print(emp.name+"\t");
		 * System.out.print(emp.dename+"\t"); System.out.print(emp.sal+"\t");
		 * System.out.println();
		 */
 }

	}

}

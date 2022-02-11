package treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Employee
{
	int eid;
	String name;
	public Employee(int eid, String name, String deptname, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.deptname = deptname;
		this.salary = salary;
	}
	String deptname;
	float salary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
//
class myIdComparator implements Comparator<Employee>
{

	public int compare(Employee e1, Employee e2)
	{
		return e1.getEid()-e2.getEid();
	}
}


class myNameComparator1 implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getName().compareTo(e2.getName());
	}
}

class myDeptComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getDeptname().compareTo(e2.getDeptname());
	}
}

class mySalaryComparator implements Comparator<Employee>
{
	public int compare(Employee e1, Employee e2)
	{
		return e1.getDeptname().compareTo(e2.getDeptname());
	}
}
public class EmployeeCutomData {

	public static void main(String[] args) {
		
		
		//Increasing order with id
   TreeSet<Employee> set=new TreeSet<Employee>(new myIdComparator());
   set.add(new Employee(101,"Mohini","IT",45000f));
   set.add(new Employee(102,"Rohini","Comp",65000f));
   set.add(new Employee(103,"Pradip","ENTC",36000f));
   set.add(new Employee(104,"Ranini","IT",65000f));


   System.out.println("Increasing order with id");
	//System.out.println("ID\tName\tDepartment\t  Salary");
	for(Employee ele : set)
	{
		System.out.print(ele.getEid() +" "+ ele.getName()+" "+ ele.getDeptname()+" "+ ele.getSalary());
		System.out.println();
		//System.out.println();

	}
	
	//Increasing order with name
	
	TreeSet<Employee> set1=new TreeSet<Employee>(new myNameComparator1());
	   set1.add(new Employee(101,"Mohini","IT",45000f));
	   set1.add(new Employee(102,"Rohini","Comp",65000f));
	   set1.add(new Employee(103,"Pradip","ENTC",36000f));
	   set1.add(new Employee(104,"Ranini","IT",65000f));

		System.out.println();

	   System.out.println("Increasing order with Name");
		//System.out.println("ID\tName\tDepartment\t  Salary");
		for(Employee ele : set1)
		{
			System.out.print(ele.getEid() +" "+ ele.getName()+" "+ ele.getDeptname()+" "+ ele.getSalary());
			System.out.println();
			//System.out.println();

		}
		//
		

		TreeSet<Employee> set2=new TreeSet<Employee>(new myDeptComparator());
		   set2.add(new Employee(101,"Mohini","IT",45000f));
		   set2.add(new Employee(102,"Rohini","Comp",65000f));
		   set2.add(new Employee(103,"Pradip","ENTC",36000f));
		   set2.add(new Employee(104,"Ranini","ELE",65000f));
			System.out.println();
		   System.out.println("Increasing order with Department name");
			//System.out.println("ID\tName\tDepartment\t  Salary");
			for(Employee ele : set2)
			{
				System.out.print(ele.getEid() +" "+ ele.getName()+" "+ ele.getDeptname()+" "+ ele.getSalary());
				System.out.println();
				//System.out.println();

			}
			
			//Increasing order data from salary
			TreeSet<Employee> set3=new TreeSet<Employee>(new mySalaryComparator());
			   set3.add(new Employee(101,"Mohini","IT",15000f));
			   set3.add(new Employee(102,"Rohini","Comp",31000f));
			   set3.add(new Employee(103,"Pradip","ENTC",55000f));
			   set3.add(new Employee(104,"Ranini","ELE",65000f));

				System.out.println();

			   System.out.println("Increasing order with Salary");
				//System.out.println("ID\tName\tDepartment\t  Salary");
				for(Employee ele : set3)
				{
					System.out.print(ele.getEid() +" "+ ele.getName()+" "+ ele.getDeptname()+" "+ ele.getSalary());
					System.out.println();
					//System.out.println();

				}
	
	}

}
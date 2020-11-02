package com.cybage;

public class Employee {

	private int empid;
	private String empName;
	private int empCode;
	private double salary;
	public Employee() {
		super();
	}
	
	public Employee(int empid, String empName, int empCode, double salary) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.empCode = empCode;
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empCode=" + empCode + ", salary=" + salary
				+ "]";
	}

	public static void main(String[] args) {
		
		Employee[] employee = new Employee[10];
		employee[0] = new Employee(101, "snaket", 2345, 2345.34F);
		employee[1] = new Employee(102, "snakt", 2345, 2345.34F);
		employee[2] = new Employee(103, "snake", 2345, 2345.34F);
		employee[3] = new Employee(104, "snaet", 2345, 2345.34F);
		employee[4] = new Employee(105, "snket", 2345, 2345.34F);
		employee[5] = new Employee(106, "saket", 2345, 2345.34F);
		employee[6] = new Employee(107, "naket", 2345, 2345.34F);
		
		int count =0;
		for(Employee e : employee)
		{
			if(e == null)
			{
				break;
			}
			else
			{
			System.out.println(e);
			count++;
			}
		}
		System.out.println("there are "+count+" object present in array");
	}
}

package company;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
protected String name;
protected int EmpID;
protected String designation;
public Employee(String name, int EmpID, String designation) {
	super();
	this.name = name;
	this.EmpID = EmpID;
	this.designation = designation;
}

public String showEmployeeDetails() {
	String details="Name: "+this.name;
	details+=", Employee ID: "+this.EmpID;
	details+=", Designation: "+this.designation;
	details+=", Salary: "+this.getSalary()+"\n";
	return details;
}
protected abstract int getSalary();

}


class Grade7Employee extends Employee{

	
	
	public Grade7Employee(String name, int EmpID, String designation) {
		super(name, EmpID, designation);
	}

	@Override
	protected int getSalary() {
		int salary=50000;
		if(designation.equals("Architect")) salary+=3000;
		if(designation.equals("Analyst")) salary+=5000;
		return salary;
	}	
}

class Grade4Employee extends Employee{

	private List<Employee> employeelist;
	
	public Grade4Employee(String name, int EmpID, String designation) {
		super(name, EmpID, designation);
		this.employeelist=new ArrayList<>();
	}

	@Override
	protected int getSalary() {
		int salary=80000;
		return salary;
	}	
	
	public void addEmployee(Employee e) {
		this.employeelist.add(e);
	}
	
	public String showEmployeeDetails() {
		String details=super.showEmployeeDetails();
		
		for(Employee emp: employeelist) {
			details+=emp.showEmployeeDetails();
		}
		
		return details;
	}
	
}


class Grade2Employee extends Employee{

	private List<Employee> employeelist;
	
	public Grade2Employee(String name, int EmpID, String designation) {
		super(name, EmpID, designation);
		this.employeelist=new ArrayList<>();
	}

	@Override
	protected int getSalary() {
		int salary=120000;
		return salary;
	}	
	
	public void addEmployee(Employee e) {
		this.employeelist.add(e);
	}
	
	public String showEmployeeDetails() {
		String details=super.showEmployeeDetails();
		
		for(Employee emp: employeelist) {
			details+=emp.showEmployeeDetails();
		}
		
		return details;
	}
	
}


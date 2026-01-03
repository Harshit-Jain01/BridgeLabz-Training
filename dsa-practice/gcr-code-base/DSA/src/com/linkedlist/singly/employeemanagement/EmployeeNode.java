package com.linkedlist.singly.employeemanagement;

public class EmployeeNode {
	    int id;
	    String name;
	    String department;
	    double salary;
	    EmployeeNode next;

	    public EmployeeNode(int id, String name, String department, double salary) {
	        this.id = id;
	        this.name = name;
	        this.department = department;
	        this.salary = salary;
	        this.next = null;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public EmployeeNode getNext() {
			return next;
		}

		public void setNext(EmployeeNode next) {
			this.next = next;
		}
	    

}

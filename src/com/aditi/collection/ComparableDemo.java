package com.aditi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,30,"Aditi");
		Employee emp2 = new Employee(2,34,"Sudarshan");
		Employee emp3 = new Employee(3,28,"Anita");
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("Before sorting");
		for(Employee emp: list){
			System.out.println(emp);
		}
		
		Collections.sort(list);
		
		System.out.println("After sorting");
		for(Employee emp: list){
			System.out.println(emp);
		}
	}
	
}

class Employee implements Comparable<Employee>{

	int empId;
	int age;
	String name;
	
	public Employee(int id, int age, String name){
		this.empId = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", age=" + age + ", name=" + name
				+ "]";
	}

	@Override
	public int compareTo(Employee empObj) {
		if(this.age>empObj.age){
			return 1;
		}else if(this.age<empObj.age){
			return -1;
		}else{
			return 0;
		}
	}
	
}
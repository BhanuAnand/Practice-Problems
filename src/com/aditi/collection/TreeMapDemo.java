package com.aditi.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Employee,String> map1 = new TreeMap<>();
		Employee emp1 = new Employee(1,30,"Aditi");
		Employee emp2 = new Employee(2,34,"Sudarshan");
		Employee emp3 = new Employee(3,28,"Anita");
		map1.put(emp1, "100");
		map1.put(emp2, "200");
		map1.put(emp3, "300");
		
		for(Map.Entry<Employee,String> entry: map1.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		/*Map<Student,String> map2 = new TreeMap<>();
		Student std1 = new Student(1,30,"Aditi");
		Student std2 = new Student(2,34,"Sudarshan");
		Student std3 = new Student(3,28,"Anita");
		map2.put(std1, "100");
		map2.put(std2, "200");
		map2.put(std3, "300");
		
		for(Map.Entry<Student,String> entry: map2.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
	}

}

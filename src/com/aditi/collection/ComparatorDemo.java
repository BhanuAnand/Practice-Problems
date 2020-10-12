package com.aditi.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		Student std1 = new Student(1,30,"Aditi");
		Student std2 = new Student(2,34,"Sudarshan");
		Student std3 = new Student(3,28,"Anita");
		list.add(std1);
		list.add(std2);
		list.add(std3);
		
		System.out.println("Before sorting");
		for(Student std: list){
			System.out.println(std);
		}
		
		Collections.sort(list, new AgeComparator());
		
		System.out.println("After sorting based on age");
		for(Student std: list){
			System.out.println(std);
		}
		
		Collections.sort(list, new NameComparator());
		
		System.out.println("After sorting based on name");
		for(Student std: list){
			System.out.println(std);
		}

	}

}

class Student {

	int stdId;
	int age;
	String name;
	
	public Student(int id, int age, String name){
		this.stdId = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", age=" + age + ", name=" + name
				+ "]";
	}

}

class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student stdObj1, Student stdObj2) {
		if(stdObj1.age>stdObj2.age){
			return 1;
		}else if(stdObj1.age<stdObj2.age){
			return -1;
		}else{
			return 0;
		}
	}
	
}

class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student stdObj1, Student stdObj2) {
		
		return stdObj1.name.compareTo(stdObj2.name);
		
	}
	
}
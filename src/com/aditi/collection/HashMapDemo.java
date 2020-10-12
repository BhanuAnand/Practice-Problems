package com.aditi.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Teacher,String> map = new HashMap<>();
		Teacher tch1 = new Teacher(1,30,"Aditi");
		Teacher tch2 = new Teacher(2,34,"Sudarshan");
		Teacher tch3 = new Teacher(3,28,"Anita");
		map.put(tch1, "100");
		map.put(tch2, "200");
		map.put(tch3, "300");
		
		for(Map.Entry<Teacher,String> entry: map.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}

}

class Teacher{

	int tchId;
	int age;
	String name;
	
	public Teacher(int id, int age, String name){
		this.tchId = id;
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Teacher [tchId=" + tchId + ", age=" + age + ", name=" + name
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + tchId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tchId != other.tchId)
			return false;
		return true;
	}

	
	
}
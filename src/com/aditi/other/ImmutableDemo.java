package com.aditi.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ImmutableDemo {
	
	private final int id;
	private final String name;
	private final List<Integer> list;
	private final Address add;

	public ImmutableDemo(int id, String name, List<Integer> list, Address add){
		this.id = id;
		this.name = name;
		/** make the list unmodifiable to maintain the immutability of the class 
		 * containing a collection that can be modified **/
		this.list = Collections.unmodifiableList(list);
		this.add = add;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<Integer> getList() {
		return list;
	}
	
	/** return a clone of Address object to maintain 
	 * immutability of a class containing mutable reference **/
	public Address getAdd() {
		Address addClone = new Address(add.getAdd());
		return addClone;
	}
	
	public static void main(String[] args) {
		try{
			List<Integer> list = new ArrayList<>();
			list.add(1);
			list.add(2);
			Address add = new Address("Kapurthala");
			ImmutableDemo obj = new ImmutableDemo(1,"Aditi",list, add);
			System.out.println(obj.toString());
			/*List<Integer> list1 =  obj.getList();
			list1.add(3);*/
			Address add1 = obj.getAdd();
			add1.setAdd("Jalandhar");
			System.out.println("");
			System.out.println(obj.toString());
			
		}catch(Exception e){
			try {
				throw new MyException("List cannot be modified.");
			} catch (MyException e1) {
				System.out.print(e1.getMessage());
			} 
		}
	}

	@Override
	public String toString() {
		return "ImmutableDemo [id=" + id + ", name=" + name + ", list size=" + list.size()
				+ ", add value=" + add.getAdd() + "]";
	}

}

class Address{
	String add;
	public Address(String add){
		this.add = add;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
}

class MyException extends Exception{

	private static final long serialVersionUID = 7525204110172750841L;
	
	public MyException(String s){
		super(s);
	}
}

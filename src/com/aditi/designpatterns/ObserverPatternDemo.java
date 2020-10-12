package com.aditi.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Channel telusko = new Channel();
		Subscriber s1 = new Subscriber("Aditi");
		Subscriber s2 = new Subscriber("Anita");
		Subscriber s3 = new Subscriber("Ram");
		Subscriber s4 = new Subscriber("Sham");
		Subscriber s5 = new Subscriber("Shimpi");
		
		telusko.subscribe(s1);
		telusko.subscribe(s2);
		telusko.subscribe(s3);
		telusko.subscribe(s4);
		telusko.subscribe(s5);
		
		//telusko.unscubscribe(s4);
		
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
		
		telusko.upload("Code in Practice");
	}

}

interface Observer{
	public void update();
	public void subscribeChannel(Channel ch);
}

interface Subject{
	public void subscribe(Subscriber sub);
	public void unscubscribe(Subscriber sub);
	public void upload(String title);
	public void notifySubscribers();
}

class Subscriber implements Observer{
	private String name;
	private Channel channel = new Channel();
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	public void subscribeChannel(Channel ch){
		channel = ch;
	}
	public void update(){
		System.out.println("Hey "+ name + ", '" + channel.title + "' Video Uploaded! " );
	}
}

class Channel implements Subject{
	private List<Subscriber> subList = new ArrayList<>();
	String title;
	
	public void subscribe(Subscriber sub){
		subList.add(sub);
	}
	public void unscubscribe(Subscriber sub){
		subList.remove(sub);
	}
	public void upload(String title){
		this.title = title;
		notifySubscribers();
	}
	public void notifySubscribers(){
		for(Subscriber sub : subList){
			sub.update();
		}
	}
}